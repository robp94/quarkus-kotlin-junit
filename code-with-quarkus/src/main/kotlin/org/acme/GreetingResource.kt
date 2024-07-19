package org.acme

import io.smallrye.mutiny.Uni
import jakarta.ws.rs.BadRequestException
import jakarta.ws.rs.ForbiddenException
import jakarta.ws.rs.GET
import jakarta.ws.rs.NotFoundException
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import java.util.concurrent.CompletionStage
import javax.annotation.processing.Completion

@Path("/hello")
class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(): String {
       return "Hello"
    }
}