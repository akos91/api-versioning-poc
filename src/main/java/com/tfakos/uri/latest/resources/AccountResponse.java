package com.tfakos.uri.latest.resources;

import java.io.Serializable;

class AccountResponse implements Serializable {

    private static final long serialVersionUID = -3287861419528394522L;

    private Long id;
	private String userName;
	private int age;

    public static AccountResponse SAMPLE = new AccountResponse();
    static {
        SAMPLE.id = 1l;
        SAMPLE.userName = "accountResponse";
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AccountResponse other = (AccountResponse) obj;
        if (age != other.age) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (userName == null) {
            if (other.userName != null) {
                return false;
            }
        } else if (!userName.equals(other.userName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AccountResponse [id=" + id + ", userName=" + userName + ", age=" + age + "]";
    }

}
