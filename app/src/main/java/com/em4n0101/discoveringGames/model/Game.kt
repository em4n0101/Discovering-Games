package com.em4n0101.discoveringGames.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

@Entity(tableName = "games_table")
@Serializable
@Parcelize
data class Game (
    @PrimaryKey
    val id: Int?,
    val slug: String,
    val name: String,
    val released: String?,
    val background_image: String,
    val rating: Float?,
    val rating_top: Float?,
    val metacritic: Float?,
    val playtime: Float?,
    val parent_platforms: List<Platform>?,
    val genres: List<Genre>?,
//    val stores: List<Store>?,
    val clip: Clip?,
    val short_screenshots: List<ScreenShot>?
) : Parcelable