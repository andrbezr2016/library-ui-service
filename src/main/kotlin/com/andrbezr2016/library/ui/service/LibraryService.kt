package com.andrbezr2016.library.ui.service

import org.springframework.stereotype.Service

@Service
class LibraryService(
    val catalogLoaderService: CatalogLoaderService,
    val recommendationLoaderService: RecommendationLoaderService
) {
}