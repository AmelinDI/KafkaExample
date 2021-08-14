package ru.kafka.dto;

public class Address {
    private String country;
    private String city;
    private String street;
    private Long homeNumber;
    private Long flatNumber;

    public Address(String country,String city,String street,Long homeNumber,Long flatNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(Long homeNumber) {
        this.homeNumber = homeNumber;
    }

    public Long getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(Long flatNumber) {
        this.flatNumber = flatNumber;
    }
}