package com.tfakos.uri.latest.resources;

import java.io.Serializable;

class EventRequest implements Serializable {

    private static final long serialVersionUID = 7976176552149329565L;

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
