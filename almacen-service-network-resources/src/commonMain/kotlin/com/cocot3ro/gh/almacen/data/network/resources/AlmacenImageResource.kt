package com.cocot3ro.gh.almacen.data.network.resources

import io.ktor.resources.Resource

@Resource(AlmacenImageResource.PATH)
class AlmacenImageResource  {

    companion object {
        const val PATH: String = "/api/almacen/images"
    }

    fun getRoute(): String = PATH

    @Resource(Item.PATH)
    data class Item(
        val parent: AlmacenImageResource = AlmacenImageResource()
    ) {

        companion object {
            const val PATH: String = "item"
        }

        fun getRoute(): String = "${parent.getRoute()}/$PATH"


        @Resource(Id.PATH)
        data class Id(
            val parent: Item = Item(),
            val id: String
        ) {

            companion object {
                const val PATH: String = "{id}"
            }

            fun getRoute(): String = "${parent.getRoute()}/$id"
        }

    }
}