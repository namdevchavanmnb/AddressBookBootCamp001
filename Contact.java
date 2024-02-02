package com.AddressBook;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String EmailId;
    private String city;
    private String state;
    private String zip;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailId() {
        return EmailId;
    }
    public void setEmailId(String emailId) {
        EmailId = emailId;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
                + ", EmailId=" + EmailId + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
    }


}

