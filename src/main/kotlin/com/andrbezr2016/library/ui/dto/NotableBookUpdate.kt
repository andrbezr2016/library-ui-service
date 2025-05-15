package com.andrbezr2016.library.ui.dto

import com.andrbezr2016.library.ui.model.ReadingStatus

data class NotableBookUpdate(
    var score: Int,
    var status: ReadingStatus
)
