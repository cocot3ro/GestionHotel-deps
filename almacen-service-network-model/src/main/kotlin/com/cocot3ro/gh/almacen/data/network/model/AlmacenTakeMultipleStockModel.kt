package com.cocot3ro.gh.almacen.data.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AlmacenTakeMultipleStockModel(
    @SerialName("store_id")
    val storeId: Long,
    val map: Map<Long, Int>
)
