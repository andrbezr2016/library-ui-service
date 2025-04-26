package com.andrbezr2016.library.ui.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.graphql.client.GraphQlClient
import org.springframework.graphql.client.HttpSyncGraphQlClient
import org.springframework.web.client.RestClient

@Configuration
class GraphQlConfig {

    @Bean
    fun graphQlClient(@Value("\${catalog-service.graphql.url}") url: String): GraphQlClient {
        val restClient = RestClient.create(url)
        return HttpSyncGraphQlClient.create(restClient)
    }
}