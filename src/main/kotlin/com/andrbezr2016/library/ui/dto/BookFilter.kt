package com.andrbezr2016.library.ui.dto

import java.util.*

data class BookFilter(
    var id: UUID? = null,
    var title: String? = null,
    var description: String? = null,
    var author: String? = null,
    var publisher: String? = null,
    var yearPublished: Int? = null,
    var isbn: String? = null,
    var pages: Int? = null,
    var tags: MutableList<TagFilter?>? = null
)