package com.tfakos.uri.v1.resources;

import java.io.Serializable;

public class AccountResponseV1 implements Serializable {

    private static final long serialVersionUID = -4102777078064020710L;

	private Long id;
	private String name;

    public static AccountResponseV1 SAMPLE = new AccountResponseV1();
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
