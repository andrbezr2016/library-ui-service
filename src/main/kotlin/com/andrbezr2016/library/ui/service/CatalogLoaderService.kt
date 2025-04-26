package com.andrbezr2016.library.ui.service

import com.andrbezr2016.library.ui.dto.BookDto
import com.andrbezr2016.library.ui.dto.BookFilter
import org.springframework.core.ParameterizedTypeReference
import org.springframework.graphql.client.GraphQlClient
import org.springframework.stereotype.Service

@Service
class CatalogLoaderService(val graphQlClient: GraphQlClient) {

    fun getBooks(bookFilter: BookFilter?): Collection<BookDto?>? {
        return graphQlClient.documentName("getBooks").variable("bookFilter", bookFilter).retrieveSync("getBooks")
            .toEntity<MutableCollection<BookDto?>?>(object :
                ParameterizedTypeReference<MutableCollection<BookDto?>?>() {
            })
    }
}