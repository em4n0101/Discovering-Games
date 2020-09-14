package com.em4n0101.discoveringGames.model.repositories

import com.em4n0101.discoveringGames.model.Game
import com.em4n0101.discoveringGames.model.Genre
import com.em4n0101.discoveringGames.model.database.GameDatabaseDao
import kotlinx.coroutines.flow.Flow

class GamesRepository(private val databaseDao: GameDatabaseDao) {
    /**
     * Database operations
     */
    suspend fun insertGame(game: Game) = databaseDao.insertGame(game)

    fun getFavoriteGames(): Flow<List<Game>> = databaseDao.getAllGames()

    fun getFavoriteGameBy(id: Int): Flow<Game?> = databaseDao.getGameBy(id)

    suspend fun deleteFavoriteGameBy(id: Int) = databaseDao.deleteGameBy(id)

    suspend fun insertGenre(genre: Genre) = databaseDao.insertGenre(genre)

    fun getFavoriteGenres(): Flow<List<Genre>> = databaseDao.getAllGenres()

    fun getFavoriteGenreBy(id: Int): Flow<Genre?> = databaseDao.getGenreBy(id)

    suspend fun deleteFavoriteGenre(id: Int) = databaseDao.deleteGenreBy(id)
}