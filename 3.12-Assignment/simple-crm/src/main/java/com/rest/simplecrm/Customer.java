package com.rest.simplecrm;

import java.util.UUID;

public class Customer {
    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String firstName;
    private String lastName;
    private String email;
    private String contactNo;
    private String jobTitle;

    public Customer() {
        this.id = UUID.randomUUID().toString();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return this.contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Number getYob() {
        return this.yob;
    }

    public void setYob(Number yob) {
        this.yob = yob;
    }
    private Number yob;

}
