package com.andrbezr2016.library.ui.service

import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

@Service
class RecommendationLoaderService(val webClient: WebClient) {
}