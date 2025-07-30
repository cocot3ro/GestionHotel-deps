package com.cocot3ro.gh.almacen.data.network.resources

import io.ktor.resources.Resource

@Resource(AlmacenRecordResource.PATH)
class AlmacenRecordResource {

    companion object {
        const val PATH: String = "/api/almacen/records"
    }

    @Resource(All.PATH)
    data class All(
        val parent: AlmacenRecordResource = AlmacenRecordResource()
    ) {

        companion object {
            const val PATH: String = "all"
        }
    }

    @Resource(RecordUser.PATH)
    data class RecordUser(
        val parent: AlmacenRecordResource = AlmacenRecordResource()
    ) {

        companion object {
            const val PATH: String = "user"
        }

        @Resource(Id.PATH)
        data class Id(
            val parent: RecordUser = RecordUser(),
            val id: Long
        ) {

            companion object {
                const val PATH: String = "{id}"
            }
        }
    }

    @Resource(RecordStore.PATH)
    data class RecordStore(
        val parent: AlmacenRecordResource = AlmacenRecordResource()
    ) {

        companion object {
            const val PATH: String = "store"
        }

        @Resource(Id.PATH)
        data class Id(
            val parent: RecordStore = RecordStore(),
            val id: Long
        ) {

            companion object {
                const val PATH: String = "{id}"
            }
        }
    }

    @Resource(RecordItem.PATH)
    data class RecordItem(
        val parent: AlmacenRecordResource = AlmacenRecordResource()
    ) {

        companion object {
            const val PATH: String = "item"
        }

        @Resource(Id.PATH)
        data class Id(
            val parent: RecordItem = RecordItem(),
            val id: Long
        ) {

            companion object {
                const val PATH: String = "{id}"
            }
        }
    }
}
