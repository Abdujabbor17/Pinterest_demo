package com.masterandroid.pinterest_demo.model.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.masterandroid.pinterest_demo.model.model.Links
import com.masterandroid.pinterest_demo.model.model.ProfileImage
import com.masterandroid.pinterest_demo.model.model.User

@Entity(tableName = "SavedImage")
data class SaveImage(

    @PrimaryKey()
    val imageId: String,
    val url: String,
    val title: String
)