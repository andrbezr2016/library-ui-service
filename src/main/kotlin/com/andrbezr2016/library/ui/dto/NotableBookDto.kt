package com.andrbezr2016.library.ui.dto

import com.andrbezr2016.library.ui.model.ReadingStatus
import java.time.LocalDateTime
import java.util.*

data class NotableBookDto(
    var id: UUID,
    var bookDto: BookDto,
    var score: Int,
    var status: ReadingStatus,
    var createdAt: LocalDateTime,
    var modifiedAt: LocalDateTime,
    var notes: MutableList<NoteDto>
)