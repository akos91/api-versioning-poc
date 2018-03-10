package com.tfakos.uri.v2.resources;

import java.io.Serializable;

class AccountResponseV2 implements Serializable {

    private static final long serialVersionUID = 4558095182637599705L;

    private Long id;
	private String userName;
	private int age;

    public static AccountResponseV2 SAMPLE = new AccountResponseV2();
    static {
        SAMPLE.id = 1l;
        SAMPLE.userName = "accountResponseV2";
        SAMPLE.age = 22;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
