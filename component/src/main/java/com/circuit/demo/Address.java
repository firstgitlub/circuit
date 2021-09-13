package com.circuit.demo;

public class Address implements Cloneable{

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String city;
    private String country;


    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    public Address(String city,String country){
        this.city = city;
        this.country = country;
    }
}
