package com.em4n0101.discoveringGames.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class Store (
    val store: InnerStore?
) : Parcelable