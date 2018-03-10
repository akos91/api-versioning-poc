package com.tfakos.mediatype.beans;

public class AccountRequestV1 {

    public static final String MEDIA_TYPE = "application/vnd.lvs.accountrequest-1+json";

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
