package com.maasbodev.mynotes.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json

val notesClient = HttpClient(OkHttp) {
    install(ContentNegotiation) {
        json()
    }
}