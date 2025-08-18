package com.cocot3ro.gh.almacen.data.network.resources

import io.ktor.resources.Resource

@Resource(path = AlmacenStoreResource.PATH)
class AlmacenStoreResource {

    companion object {
        const val PATH: String = "/api/almacen/stores"
    }

    fun getRoute(): String = PATH

    @Resource(path = All.PATH)
    data class All(
        val parent: AlmacenStoreResource = AlmacenStoreResource()
    ) {

        companion object {
            const val PATH: String = "all"
        }

        fun getRoute(): String = "${parent.getRoute()}/$PATH"
    }

    @Resource(path = Id.PATH)
    data class Id(
        val parent: AlmacenStoreResource = AlmacenStoreResource(),
        val id: Long
    ) {

        companion object {
            const val PATH: String = "{id}"
        }

        fun getRoute(): String = "${parent.getRoute()}/$id"
    }
}