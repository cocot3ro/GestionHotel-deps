package com.cocot3ro.gh.almacen.data.network.resources

import io.ktor.resources.Resource

@Resource(path = AlmacenResource.PATH)
class AlmacenResource {

    companion object {
        const val PATH: String = "/api/almacen"
    }

    fun getRoute(): String = PATH

    @Resource(path = Status.PATH)
    data class Status(
        val parent: AlmacenResource = AlmacenResource()
    ) {

        companion object {
            const val PATH: String = "status"
        }

        fun getRoute(): String = "${parent.getRoute()}/$PATH"
    }

}