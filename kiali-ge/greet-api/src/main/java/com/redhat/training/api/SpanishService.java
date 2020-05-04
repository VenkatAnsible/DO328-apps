package com.redhat.training.api;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient
public interface SpanishService {

    @Path("/")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHola();

}
