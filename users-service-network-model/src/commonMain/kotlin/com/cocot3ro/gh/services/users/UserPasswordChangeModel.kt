package com.cocot3ro.gh.services.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserPasswordChangeModel(
    @SerialName("current_password")
    val currentPassword: String?,

    @SerialName("new_password")
    val newPassword: String?
)
