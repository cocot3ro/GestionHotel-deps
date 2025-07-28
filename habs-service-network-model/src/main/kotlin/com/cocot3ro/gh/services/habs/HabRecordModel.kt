package com.cocot3ro.gh.services.habs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HabRecordModel(
    val id: Long,

    val timestamp: String,

    @SerialName("register_timestamp")
    val registerTimestamp: String,

    val breakfast: Int,

    val lunches: Int,

    val dinners: Int
)
