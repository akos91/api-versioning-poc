package com.tfakos.mediatype.beans;

public class AccountRequestV2 {

    public static final String MEDIA_TYPE_V2 = "application/vnd.lvs.accountrequest-2+json";

	private String userName;
    private String firstName;
    private String lastName;

    public static AccountRequestV2 SAMPLE = new AccountRequestV2();
    static {
        SAMPLE.userName = "accountRequestV2";
        SAMPLE.firstName = "accReq";
        SAMPLE.lastName = "V2";
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
