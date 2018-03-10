package com.tfakos.uri.v1.resources;

import java.io.Serializable;

class EventResponseV1 implements Serializable {

    private static final long serialVersionUID = 7976076589195531398L;

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
