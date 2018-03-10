package com.tfakos.apiversioning.v1.resources;

import java.io.Serializable;

class AccountResponse implements Serializable {

    private static final long serialVersionUID = -6380529173157151957L;

    private Long id;
	private String name;

    public static AccountResponse SAMPLE = new AccountResponse();
    static {
        SAMPLE.id = 1l;
        SAMPLE.name = "accountResponseV1";
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
