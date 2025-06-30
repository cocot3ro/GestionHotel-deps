package com.cocot3ro.gh.services.users

import io.ktor.resources.Resource

@Resource(UserImagesResources.PATH)
class UserImagesResources {

    companion object {
        const val PATH: String = "/api/almacen/images"
    }

    fun getRoute(): String = PATH

    @Resource(User.PATH)
    data class User(
        val parent: UserImagesResources = UserImagesResources()
    ) {

        companion object {
            const val PATH: String = "user"
        }

        fun getRoute(): String = "${parent.getRoute()}/$PATH"

        @Resource(Id.PATH)
        data class Id(
            val parent: User = User(),
            val id: String
        ) {

            companion object {
                const val PATH: String = "{id}"
            }

            fun getRoute(): String = "${parent.getRoute()}/$id"
        }
    }
}