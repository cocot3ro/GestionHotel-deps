package com.cocot3ro.gh.services.habs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HabModel(
    val id: Long,

    @SerialName("room_number")
    val roomNumber: Int,

    @SerialName("check_in_date")
    val checkInDate: String,

    @SerialName("check_out_date")
    val checkOutDate: String,

    val regimen: RegimenModel,

    @SerialName("person_count")
    val personCount: Int,

    @SerialName("hab_group")
    val habGroup: String? = null
)
