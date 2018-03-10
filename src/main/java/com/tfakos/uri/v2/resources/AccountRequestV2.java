package com.tfakos.uri.v2.resources;

import java.io.Serializable;

class AccountRequestV2 implements Serializable {

    private static final long serialVersionUID = -5712056372831463940L;

    private String userName;

    public static AccountRequestV2 SAMPLE = new AccountRequestV2();
    static {
        SAMPLE.userName = "accountRequestV2";
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
