package com.masterandroid.pinterest_demo.model.modelSearch

import com.masterandroid.pinterest_demo.model.model.Links
import com.masterandroid.pinterest_demo.model.model.ProfileImage
import com.masterandroid.pinterest_demo.model.model.User


data class Result (
    val id: String,
    val description: String? = null,
    val urls: Urls2? = null,
    val firstname:User? = null,
    val lastname:User? = null,
    val profileImage: ProfileImage?=null,
    val followers:Links? = null
)

