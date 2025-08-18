package com.cocot3ro.gh.almacen.data.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AlmacenTakeStockModel(
    @SerialName("store_id")
    val storeId: Long,
    val quantity: Int
)
