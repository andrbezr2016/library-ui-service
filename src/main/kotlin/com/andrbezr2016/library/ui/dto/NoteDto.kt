package com.andrbezr2016.library.ui.dto

import java.time.LocalDateTime
import java.util.*

class NoteDto {

    var id: UUID? = null
    var notableBookId: UUID? = null
    var content: String? = null
    var createdAt: LocalDateTime? = null
    var modifiedAt: LocalDateTime? = null
}