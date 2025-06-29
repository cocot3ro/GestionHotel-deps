package com.cocot3ro.gh.services.login

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginResponseModel(
    @SerialName("user_id")
    val userId: Long,

    @SerialName("jwt_token")
    val jwtToken: String,

    @SerialName("refresh_token")
    val refreshToken: String,

    @SerialName("expires_at")
    val expiresAt: String
)
