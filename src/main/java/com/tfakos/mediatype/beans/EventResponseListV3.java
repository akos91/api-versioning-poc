package com.tfakos.mediatype.beans;

import java.util.List;

public class EventResponseListV3 {

    public static final String MEDIA_TYPE_V3 = "application/vnd.lvs.eventresponselist-3+json";

    private List<EventResponseV2> events;

    public List<EventResponseV2> getEvents() {
        return events;
    }

    public void setEvents(List<EventResponseV2> events) {
        this.events = events;
    }

}
