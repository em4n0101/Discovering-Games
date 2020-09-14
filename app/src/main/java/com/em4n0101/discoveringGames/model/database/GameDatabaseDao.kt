package com.em4n0101.discoveringGames.model.database

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.em4n0101.discoveringGames.model.Game
import com.em4n0101.discoveringGames.model.Genre
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged

interface GameDatabaseDao {
    /**
     * Operations for games
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGame(game: Game)

    @Query("SELECT * FROM games_table WHERE id = :id")
    fun getGameBy(id: Int): Flow<Game?>

    @ExperimentalCoroutinesApi
    fun getGameByIdDistinctUntilChanged(id: Int) =
        getGameBy(id).distinctUntilChanged()

    @Query("SELECT * FROM games_table")
    fun getAllGames(): Flow<List<Game>>

    @Query("DELETE FROM games_table WHERE id = :id")
    suspend fun deleteGameBy(id: Int)

    /**
     * Operations for genres
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGenre(genre: Genre)

    @Query("SELECT * FROM genre_table WHERE id = :id")
    fun getGenreBy(id: Int): Flow<Genre?>

    @ExperimentalCoroutinesApi
    fun getGenreByIdDistinctUntilChanged(id: Int) =
        getGenreBy(id).distinctUntilChanged()

    @Query("SELECT * FROM genre_table")
    fun getAllGenres(): Flow<List<Genre>>

    @Query("DELETE FROM genre_table WHERE id = :id")
    suspend fun deleteGenreBy(id: Int)
}