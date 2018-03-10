package com.tfakos.uri.latest.resources;

import java.io.Serializable;

public class AccountRequest implements Serializable {

    private static final long serialVersionUID = 6857488740616158841L;

    private String userName;

    public static AccountRequest SAMPLE = new AccountRequest();
    static {
        SAMPLE.userName = "accountRequest";
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
