package com.tfakos.mediatype.beans;

public class AccountResponseV1 {

    public static final String MEDIA_TYPE_V1 = "application/vnd.lvs.accountresponse-1+json";

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
