package com.em4n0101.discoveringGames.model

import kotlinx.serialization.Serializable

@Serializable
data class Rating (
    val id: Int,
    val name: String
)