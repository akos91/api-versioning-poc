package com.tfakos.mediatype.beans;

public class AccountRequestV3 {

    public static final String MEDIA_TYPE = "application/vnd.lvs.accountrequest-1+json";

	private String userName;
    private String firstName;
    private String lastName;
    private int dob;

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

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

}
