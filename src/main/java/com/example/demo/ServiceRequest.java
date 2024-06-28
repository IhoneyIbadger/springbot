package com.example.demo;

public class ServiceRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String request;

    public ServiceRequest(String firstName, String lastName, String email, String request) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.request = request;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getRequest() {
        return request;
    }
}
