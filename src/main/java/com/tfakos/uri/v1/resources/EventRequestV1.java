package com.tfakos.uri.v1.resources;

import java.io.Serializable;

class EventRequestV1 implements Serializable {

    private static final long serialVersionUID = 3509976755855474068L;

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
