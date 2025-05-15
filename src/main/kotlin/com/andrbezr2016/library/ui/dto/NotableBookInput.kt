package com.andrbezr2016.library.ui.dto

import com.andrbezr2016.library.ui.model.ReadingStatus
import java.util.*

data class NotableBookInput(
    var bookId: UUID,
    var score: Int,
    var status: ReadingStatus
)
