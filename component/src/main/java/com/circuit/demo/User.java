package com.circuit.demo;

public class User implements Cloneable{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;


    @Override
    public User clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.setAddress(this.address.clone());
        return user;
    }

    public User(String name,Address address){
        this.name = name;
        this.address = address;
    }

}
