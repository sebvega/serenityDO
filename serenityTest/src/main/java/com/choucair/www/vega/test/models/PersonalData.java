package com.choucair.www.vega.test.models;

public class PersonalData {
    private String user;
    private String password;

    public PersonalData(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
