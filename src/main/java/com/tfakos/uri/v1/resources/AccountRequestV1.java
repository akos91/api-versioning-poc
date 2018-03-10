package com.tfakos.uri.v1.resources;

import java.io.Serializable;

class AccountRequestV1 implements Serializable {

    private static final long serialVersionUID = -2149273176850807875L;

    private String name;

    public static AccountRequestV1 SAMPLE = new AccountRequestV1();
    static {
        SAMPLE.name = "accountRequestV1";
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
