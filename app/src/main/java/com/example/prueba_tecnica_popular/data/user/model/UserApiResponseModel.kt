package com.example.prueba_tecnica_popular.data.user.model

import com.google.gson.annotations.SerializedName

data class UserApiResponseModel(
    @SerializedName(value = "page") val page: Int,
    @SerializedName(value = "per_page") val perPage: Int,
    @SerializedName(value = "total") val total: Int,
    @SerializedName(value = "total_pages") val totalPages: Int,
    @SerializedName(value = "data") val data: List<UserModel>,
)
