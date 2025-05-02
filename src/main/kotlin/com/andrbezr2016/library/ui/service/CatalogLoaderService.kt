package com.andrbezr2016.library.ui.service

import com.andrbezr2016.library.ui.dto.BookDto
import com.andrbezr2016.library.ui.dto.BookFilter
import com.andrbezr2016.library.ui.dto.BookInput
import com.andrbezr2016.library.ui.dto.BookUpdate
import org.springframework.core.ParameterizedTypeReference
import org.springframework.graphql.client.GraphQlClient
import org.springframework.stereotype.Service
import java.util.*

@Service
class CatalogLoaderService(val graphQlClient: GraphQlClient) {

    fun getBooks(bookFilter: BookFilter?): Collection<BookDto?>? {
        return graphQlClient.documentName("getBooks").variable("bookFilter", bookFilter).retrieveSync("getBooks")
            .toEntity<MutableCollection<BookDto?>?>(object :
                ParameterizedTypeReference<MutableCollection<BookDto?>?>() {
            })
    }

    fun addBook(bookInput: BookInput?): Collection<BookDto?>? {
        return graphQlClient.documentName("addBook").variable("bookInput", bookInput).retrieveSync("addBook")
            .toEntity<MutableCollection<BookDto?>?>(object :
                ParameterizedTypeReference<MutableCollection<BookDto?>?>() {
            })
    }

    fun updateBook(bookId: UUID?, bookUpdate: BookUpdate?): Collection<BookDto?>? {
        return graphQlClient.documentName("updateBook").variables(mapOf("id" to bookId, "bookUpdate" to bookUpdate))
            .retrieveSync("updateBook")
            .toEntity<MutableCollection<BookDto?>?>(object :
                ParameterizedTypeReference<MutableCollection<BookDto?>?>() {
            })
    }

    fun deleteBook(bookId: UUID?): Collection<BookDto?>? {
        return graphQlClient.documentName("deleteBook").variable("id", bookId).retrieveSync("deleteBook")
            .toEntity<MutableCollection<BookDto?>?>(object :
                ParameterizedTypeReference<MutableCollection<BookDto?>?>() {
            })
    }
}