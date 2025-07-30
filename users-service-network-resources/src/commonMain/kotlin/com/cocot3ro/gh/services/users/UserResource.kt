package com.cocot3ro.gh.services.users

import io.ktor.resources.Resource

@Resource(path = UserResource.PATH)
class UserResource {

    companion object {
        const val PATH: String = "/api/users"
    }

    fun getRoute(): String = PATH

    @Resource(path = All.PATH)
    data class All(
        val parent: UserResource = UserResource(),
    ) {

        companion object {
            const val PATH: String = "all"
        }

        fun getRoute(): String = "${parent.getRoute()}/$PATH"
    }

    @Resource(path = Id.PATH)
    data class Id(
        val parent: UserResource = UserResource(),
        val id: Long,
    ) {

        companion object {
            const val PATH: String = "{id}"
        }

        fun getRoute(): String = "${parent.getRoute()}/$id"
    }
}
