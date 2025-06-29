package com.cocot3ro.gh.services.login

import kotlinx.serialization.Serializable

@Serializable
data class RefreshRequestModel(
    val refreshToken: String
)