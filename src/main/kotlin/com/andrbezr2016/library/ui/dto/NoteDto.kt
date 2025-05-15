package com.andrbezr2016.library.ui.dto

import java.time.LocalDateTime
import java.util.*

data class NoteDto(
    var id: UUID,
    var notableBookId: UUID,
    var content: String,
    var createdAt: LocalDateTime,
    var modifiedAt: LocalDateTime,
)