package com.cocot3ro.gh.almacen.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class AlmacenAddMultipleStockModel(
    val map: Map<Long, Int>
)
