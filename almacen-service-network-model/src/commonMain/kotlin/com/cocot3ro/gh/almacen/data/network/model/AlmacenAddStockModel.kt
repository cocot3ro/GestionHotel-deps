package com.cocot3ro.gh.almacen.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class AlmacenAddStockModel(
    val quantity: Int
)
