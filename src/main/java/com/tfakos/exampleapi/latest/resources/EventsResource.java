package com.tfakos.exampleapi.latest.resources;

import java.util.List;

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
@Path("v[2-9]./events")
public class EventsResource {

    @GET
    public List<EventResponse> loadAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @GET
    @Path("{id : [-0-9][0-9]*}")
    public EventResponse loadEvent(@PathParam("id") Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @POST
    public void createEvent(EventRequest event) {
		// TODO Auto-generated method stub
	}

    @PUT
    @Path("{id : [-0-9][0-9]*")
    public EventResponse updateEvent(@PathParam("id") String accountId, EventRequest event) {
        // TODO Auto-generated method stub
        return null;
    }

}
