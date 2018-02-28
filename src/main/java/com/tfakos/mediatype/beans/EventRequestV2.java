package com.tfakos.mediatype.beans;

import java.util.Date;

public class EventRequestV2 {

    public static final String MEDIA_TYPE_V3 = "application/vnd.lvs.eventrequest-3+json";
    public static final String MEDIA_TYPE_V2 = "application/vnd.lvs.eventrequest-2+json";

    private String opponentA;
    private String opponentB;
    private Date startDateTime;

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
