package com.pwc;

public class Customer {
    private  int  custId;
    private String name;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public int getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
