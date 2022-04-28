package com.masterandroid.pinterest_demo.model.relatedcollection

import com.masterandroid.pinterest_demo.model.model.Urls


data class SinglePhoto(
    val id: String,
    val urls: Urls,
    val likes: Long,
    val related_collections: RelatedCollections,
)
