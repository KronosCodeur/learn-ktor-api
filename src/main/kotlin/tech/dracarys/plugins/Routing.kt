package tech.dracarys.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import tech.dracarys.routes.customerRouting
import tech.dracarys.routes.ordersRoute
import tech.dracarys.routes.totalizeOrderRoute

fun Application.configureRouting() {
    routing {
        customerRouting()
        ordersRoute()
        totalizeOrderRoute()
    }
}
