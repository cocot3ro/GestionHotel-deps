package com.cocot3ro.gh.almacen.data.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AlmacenRecordModel(
    val id: Long,

    @SerialName("user_id")
    val userId: Long,

    @SerialName("store_id")
    val storeId: Long,

    @SerialName("item_id")
    val itemId: Long,

    val timestamp: String,

    val quantity: Int
)
