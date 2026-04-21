package dev.seeruk

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

@Serializable
data class Example(val id: Int)

fun Application.configureRouting() {
    routing {
        post<Example>("/example") { example ->
            call.respondText(example.toString())
        }
    }
}