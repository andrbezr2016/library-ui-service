package com.andrbezr2016.library.ui.service

import com.andrbezr2016.library.ui.dto.*
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToMono
import java.util.*

@Service
class RecommendationLoaderService(val webClient: WebClient) {

    fun addNotableBook(notableBookInput: NotableBookInput?): NotableBookDto {
        return webClient.post()
            .uri("/notableBooks/add")
            .body(BodyInserters.fromValue(notableBookInput!!))
            .retrieve()
            .bodyToMono<NotableBookDto>().blockOptional().orElseThrow()
    }

    fun updateNotableBook(notableBookId: UUID?, notableBookUpdate: NotableBookUpdate?): NotableBookDto {
        return webClient.patch()
            .uri("/notableBooks/{notableBookId}/update", notableBookId)
            .body(BodyInserters.fromValue(notableBookUpdate!!))
            .retrieve()
            .bodyToMono<NotableBookDto>().blockOptional().orElseThrow()
    }

    fun deleteNotableBook(notableBookId: UUID?): NotableBookDto {
        return webClient.delete()
            .uri("/notableBooks/{notableBookId}/delete", notableBookId)
            .retrieve()
            .bodyToMono<NotableBookDto>().blockOptional().orElseThrow()
    }

    fun getNotableBook(notableBookId: UUID?): NotableBookDto {
        return webClient.get()
            .uri("/notableBooks/{notableBookId}", notableBookId)
            .retrieve()
            .bodyToMono<NotableBookDto>().blockOptional().orElseThrow()
    }

    fun getNotableBooks(): MutableCollection<NotableBookDto?> {
        return webClient.get()
            .uri("/notableBooks/all")
            .retrieve()
            .bodyToMono<MutableCollection<NotableBookDto?>>().blockOptional().orElseThrow()
    }

    fun addNote(notableBookId: UUID?, noteInput: NoteInput?): NoteDto {
        return webClient.post()
            .uri("/notableBooks/{notableBookId}/notes/add", notableBookId)
            .body(BodyInserters.fromValue(noteInput!!))
            .retrieve()
            .bodyToMono<NoteDto>().blockOptional().orElseThrow()
    }

    fun updateNote(noteId: UUID?, noteUpdate: NoteUpdate?): NoteDto {
        return webClient.patch()
            .uri("/notableBooks/notes/{noteId}/update", noteId)
            .body(BodyInserters.fromValue(noteUpdate!!))
            .retrieve()
            .bodyToMono<NoteDto>().blockOptional().orElseThrow()
    }

    fun deleteNote(noteId: UUID?): NoteDto {
        return webClient.delete()
            .uri("/notableBooks/notes/{noteId}/delete", noteId)
            .retrieve()
            .bodyToMono<NoteDto>().blockOptional().orElseThrow()
    }

    fun getBooksToRead(): MutableCollection<BookDto?> {
        return webClient.get()
            .uri("/books/getBooksToRead")
            .retrieve()
            .bodyToMono<MutableCollection<BookDto?>>().blockOptional().orElseThrow()
    }
}