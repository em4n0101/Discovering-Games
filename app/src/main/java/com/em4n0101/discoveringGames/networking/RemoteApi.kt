package com.em4n0101.discoveringGames.networking

import com.em4n0101.discoveringGames.model.Failure
import com.em4n0101.discoveringGames.model.Success
import com.em4n0101.discoveringGames.model.Result
import com.em4n0101.discoveringGames.model.response.GameDetailsResponse
import com.em4n0101.discoveringGames.model.response.TopGamesResponse

class RemoteApi(private val remoteApiService: RemoteApiService) {
    /**
     * Get top games, ordering by released date
     */
    suspend fun getTopGames(): Result<TopGamesResponse> = try {
        val data = remoteApiService.getTopGames()
        Success(data)
    } catch (error: Throwable) {
        Failure(error)
    }

    /**
     * Get game details
     */
    suspend fun getGameDetails(gameId: Int): Result<GameDetailsResponse> = try {
        val data = remoteApiService.getGameDetails(gameId.toString())
        Success(data)
    } catch (error: Throwable) {
        Failure(error)
    }

    /**
     * Search for the games according to the user input
     */
    suspend fun searchForAGame(inputToSearch: String): Result<TopGamesResponse> = try {
        val data = remoteApiService.searchGamesForUserInput(inputToSearch)
        Success(data)
    } catch (error: Throwable) {
        Failure(error)
    }

    /**
     * Search for the games according to his genre
     */
    suspend fun searchGamesForGenre(genreName: String): Result<TopGamesResponse> = try {
        val data = remoteApiService.searchGamesForGenre(genreName)
        Success(data)
    } catch (error: Throwable) {
        Failure(error)
    }

    /**
     * Search for the games according to his genre
     */
    suspend fun searchSimilarGames(gameName: String): Result<TopGamesResponse> = try {
        val data = remoteApiService.searchSimilarGames(gameName)
        Success(data)
    } catch (error: Throwable) {
        Failure(error)
    }
}