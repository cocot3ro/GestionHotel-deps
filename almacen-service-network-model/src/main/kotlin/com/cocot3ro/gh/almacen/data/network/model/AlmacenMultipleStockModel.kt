package com.cocot3ro.gh.almacen.data.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AlmacenMultipleStockModel(
    val ok: Int,

    @SerialName("not_found")
    val notFound: Int
)
