package com.tfakos.uri.v1.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Path("v1/events")
public class EventsResourceV1 {

    @GET
    @Path("{id : [-0-9][0-9]*}")
    public EventResponseV1 loadEvent(@PathParam("id") Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @POST
    public void createEvent(EventRequestV1 event) {
		// TODO Auto-generated method stub
	}

    @PUT
    @Path("{id : [-0-9][0-9]*")
    public EventResponseV1 updateEvent(@PathParam("id") String accountId, EventRequestV1 event) {
        // TODO Auto-generated method stub
        return null;
    }

}
