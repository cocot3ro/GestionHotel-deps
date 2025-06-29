package com.cocot3ro.gh.almacen.data.network.resources

import io.ktor.resources.Resource

@Resource(AlmacenItemResource.PATH)
class AlmacenItemResource {

    companion object {
        const val PATH: String = "/api/almacen/items"
    }

    fun getRoute(): String = PATH

    @Resource(All.PATH)
    data class All(
        val parent: AlmacenItemResource = AlmacenItemResource()
    ) {

        companion object {
            const val PATH: String = "all"
        }

        fun getRoute(): String = "${parent.getRoute()}/$PATH"
    }

    @Resource(Id.PATH)
    data class Id(
        val parent: AlmacenItemResource = AlmacenItemResource(),
        val id: Long
    ) {

        companion object {
            const val PATH: String = "{id}"
        }

        fun getRoute(): String = "${parent.getRoute()}/$id"

        @Resource(TakeStock.PATH)
        data class TakeStock(
            val parent: Id
        ) {

            companion object {
                const val PATH: String = "take"
            }

            fun getRoute(): String = "${parent.getRoute()}/$PATH"
        }

        @Resource(AddStock.PATH)
        data class AddStock(
            val parent: Id
        ) {

            companion object {
                const val PATH: String = "add"
            }

            fun getRoute(): String = "${parent.getRoute()}/$PATH"
        }
    }
}