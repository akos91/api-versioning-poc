package com.tfakos.mediatype.beans;

import java.util.Date;

public class EventResponseV2 {

    public static final String MEDIA_TYPE_V2 = "application/vnd.lvs.eventresponse-2+json";

    private long id;
    private String opponentA;
    private String opponentB;
    private Date startDateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOpponentA() {
        return opponentA;
    }

    public void setOpponentA(String opponentA) {
        this.opponentA = opponentA;
    }

    public String getOpponentB() {
        return opponentB;
    }

    public void setOpponentB(String opponentB) {
        this.opponentB = opponentB;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

}
