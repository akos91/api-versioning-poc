package com.tfakos.uri.latest.resources;

import java.io.Serializable;

class EventResponse implements Serializable {

    private static final long serialVersionUID = 987761669751069772L;

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
