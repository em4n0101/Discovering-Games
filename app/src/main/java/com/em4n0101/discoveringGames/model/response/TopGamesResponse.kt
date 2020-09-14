package com.em4n0101.discoveringGames.model.response

import com.em4n0101.discoveringGames.model.Game
import kotlinx.serialization.Serializable

@Serializable
data class TopGamesResponse (
    val results: List<Game>
)