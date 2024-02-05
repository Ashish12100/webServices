package com.example.WebServices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Web_Info")
public class WebModel {
    @Id
    private String Id;
    private String Name;
    private String Address;

    private String PhoneNumber;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public WebModel(String id, String name, String address, String phoneNumber) {
        Id = id;
        Name = name;
        Address = address;
        PhoneNumber = phoneNumber;
    }

    public WebModel() {
    }
}
