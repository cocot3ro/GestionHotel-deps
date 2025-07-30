package com.cocot3ro.gh.services.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserModel(
    val id: Long = 0L,
    val name: String,
    val image: String?,
    @SerialName("requires_password")
    val requiresPassword: Boolean,
    val role: UserRoleModel
)