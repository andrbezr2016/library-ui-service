package com.andrbezr2016.library.ui.dto

data class BookUpdate(
    var title: String,
    var description: String,
    var author: String,
    var publisher: String,
    var yearPublished: Int,
    var isbn: String,
    var pages: Int,
    var tags: MutableList<TagUpdate>
)
