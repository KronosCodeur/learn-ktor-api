package tech.dracarys

import io.ktor.server.application.*
import io.ktor.server.plugins.cors.routing.*
import tech.dracarys.plugins.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    install(CORS){
        anyHost()
    }
    configureSerialization()
    configureRouting()
}
