package com.tfakos.mediatype.beans;

public class AccountResponseV3 {

    public static final String MEDIA_TYPE_V3 = "application/vnd.lvs.accountresponse-3+json";

	private Long id;
	private String userName;
    private String firstName;
    private String lastName;
	private int age;

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

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
