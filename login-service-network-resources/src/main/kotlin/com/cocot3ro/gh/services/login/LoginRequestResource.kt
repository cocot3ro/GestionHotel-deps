package com.cocot3ro.gh.services.login

import io.ktor.resources.Resource

@Resource(LoginRequestResource.PATH)
class LoginRequestResource {

    companion object {
        const val PATH: String = "/api/auth"
    }

    fun getRoute(): String = PATH

    @Resource(Login.PATH)
    data class Login(
        val parent: LoginRequestResource = LoginRequestResource()
    ) {
        companion object {
            const val PATH: String = "login"
        }

        fun getRoute(): String = "${parent.getRoute()}/$PATH"
    }

    @Resource(Refresh.PATH)
    data class Refresh(
        val parent: LoginRequestResource = LoginRequestResource()
    ) {
        companion object {
            const val PATH: String = "refresh"
        }

        fun getRoute(): String = "${parent.getRoute()}/$PATH"
    }
}