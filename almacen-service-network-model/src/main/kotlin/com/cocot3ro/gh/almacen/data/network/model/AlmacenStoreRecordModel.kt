package com.cocot3ro.gh.almacen.data.network.model

import kotlinx.serialization.Serializable

@Serializable
data class AlmacenStoreRecordModel(
    val id: Long,
    val name: String
)
