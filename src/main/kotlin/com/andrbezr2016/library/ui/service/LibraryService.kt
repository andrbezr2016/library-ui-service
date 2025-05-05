package com.andrbezr2016.library.ui.service

import com.andrbezr2016.library.ui.dto.*
import org.springframework.stereotype.Service
import java.util.*

@Service
class LibraryService(
    val catalogLoaderService: CatalogLoaderService,
    val recommendationLoaderService: RecommendationLoaderService
) {

    fun getBooks(): Collection<BookDto?>? {
        return catalogLoaderService.getBooks(BookFilter())
    }

    fun getBooksToRead(): Collection<BookDto?>? {
        return recommendationLoaderService.getBooksToRead()
    }

    fun getNotableBooks(): Collection<NotableBookDto?>? {
        return recommendationLoaderService.getNotableBooks()
    }

    fun addBook(bookInput: BookInput) {
        catalogLoaderService.addBook(bookInput)
    }

    fun updateBook(bookId: UUID, bookUpdate: BookUpdate) {
        catalogLoaderService.updateBook(bookId, bookUpdate)
    }

    fun deleteBook(bookId: UUID) {
        catalogLoaderService.deleteBook(bookId)
    }
}