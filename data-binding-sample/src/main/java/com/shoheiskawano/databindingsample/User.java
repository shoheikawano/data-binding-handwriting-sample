package com.shoheiskawano.databindingsample;

public class User {

    private static final String DEFAULT_NAME = "user";

    public final String firstName;
    public final String lastName;
    public final String fullName;
    public final String nullName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = this.firstName + " " + this.lastName;
        this.nullName = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }
    public String getNullName() {
        return null;
    }

    /*
        Although it is a static value being returned,
        this 'getter' method still needs to be declared to be available in the layout
     */
    public String getDEFAULT_NAME() {
        return DEFAULT_NAME;
    }
}
