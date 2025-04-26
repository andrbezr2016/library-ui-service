package com.andrbezr2016.library.ui.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfig {

    @Bean
    fun webClient(@Value("\${recommendation-service.rest.url}") url: String): WebClient {
        return WebClient.create(url)
    }
}