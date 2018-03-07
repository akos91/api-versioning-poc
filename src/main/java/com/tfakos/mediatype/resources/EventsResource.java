package com.tfakos.mediatype.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tfakos.mediatype.beans.EventRequestV1;
import com.tfakos.mediatype.beans.EventRequestV2;
import com.tfakos.mediatype.beans.EventResponseListV3;
import com.tfakos.mediatype.beans.EventResponseV1;
import com.tfakos.mediatype.beans.EventResponseV2;

@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Path("mediatype/events")
public class EventsResource {

    // new method introduced in V3
    @GET
    @Produces(EventResponseListV3.MEDIA_TYPE_V3)
    public EventResponseListV3 loadAll() {
        // TODO Auto-generated method stub
        return null;
    }

    // response changed in V2, but no change in V3
    @GET
    @Path("{id : [0-9]+}")
    @Produces(EventResponseV2.MEDIA_TYPE_V2)
    public EventResponseV2 loadEvent(@PathParam("id") Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @GET
    @Path("{id : [0-9]+}")
    @Produces(EventResponseV1.MEDIA_TYPE_V1)
    public EventResponseV1 loadEvent1(@PathParam("id") Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    // new 'startDateTime' request field introduced in V2, but no change in V3
    @POST
    @Consumes({ EventRequestV2.MEDIA_TYPE_V2, EventRequestV2.MEDIA_TYPE_V3 })
    public void createEvent(EventRequestV2 event) {
		// TODO Auto-generated method stub
	}

    @POST
    @Consumes(EventRequestV1.MEDIA_TYPE_V1)
    public void createEventV1(EventRequestV1 event) {
        // TODO Auto-generated method stub
    }

    // new 'startDateTime' request field introduced in V2, but no change in V3
    @PUT
    @Path("{id : [0-9]+}")
    @Consumes({ EventRequestV2.MEDIA_TYPE_V2, EventRequestV2.MEDIA_TYPE_V3 })
    @Produces(EventResponseV2.MEDIA_TYPE_V2)
    public EventResponseV2 updateEvent(@PathParam("id") String accountId, EventRequestV2 event) {
        // TODO Auto-generated method stub
        return null;
    }

    @PUT
    @Path("{id : [0-9]+}")
    @Consumes(EventRequestV1.MEDIA_TYPE_V1)
    @Produces(EventResponseV1.MEDIA_TYPE_V1)
    public EventResponseV1 updateEventV1(@PathParam("id") String accountId, EventRequestV1 event) {
        // TODO Auto-generated method stub
        return null;
    }

    // what to do when we want to mark this end point as deprecated in V2 and remove it in V3
    @DELETE
    @Path("{id : [0-9]+}")
    public void deleteEvent(@PathParam("id") Long id) {
        // TODO Auto-generated method stub
    }

}
