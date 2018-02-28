package com.tfakos.mediatype.beans;

public class EventRequestV1 {

    public static final String MEDIA_TYPE_V1 = "application/vnd.lvs.eventrequest-1+json";

    private String opponentA;
    private String opponentB;

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

}
