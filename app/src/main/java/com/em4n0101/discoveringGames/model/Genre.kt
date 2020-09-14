package com.em4n0101.discoveringGames.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
@Entity(tableName = "genre_table")
data class Genre (
    @PrimaryKey
    val id: Int,
    val name: String?,
    val slug: String?
) : Parcelable