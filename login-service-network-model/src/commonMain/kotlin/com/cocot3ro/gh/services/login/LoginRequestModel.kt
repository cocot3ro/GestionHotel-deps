package com.cocot3ro.gh.services.login

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginRequestModel(
    @SerialName("user_id")
    val userId: Long,

    val password: String?
)