package com.andrbezr2016.library.ui.dto

import com.andrbezr2016.library.ui.model.ReadingStatus
import java.time.LocalDateTime
import java.util.*

class NotableBookDto {

    var id: UUID? = null
    var bookDto: BookDto? = null
    var score: Int? = null
    var status: ReadingStatus? = null
    var createdAt: LocalDateTime? = null
    var modifiedAt: LocalDateTime? = null
    var notes: MutableList<NoteDto?>? = null
}