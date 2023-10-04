package com.pwc;

public class Address {
    public String city;
    public  String country;

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
