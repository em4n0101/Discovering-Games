package com.em4n0101.discoveringGames.app.di

import com.em4n0101.discoveringGames.model.database.GameDatabase
import com.em4n0101.discoveringGames.model.repositories.GamesRepository
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val modelModule = module {
    single { GameDatabase.getDatabase(androidApplication()) }

    single { get<GameDatabase>().gameDatabaseDao }

    single { GamesRepository(get()) }
}