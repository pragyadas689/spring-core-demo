package com.pwc;

import java.util.List;
import java.util.Map;
import java.util.Set;
public class Employee {
    private String name;
    private List<String> phone;
    private Set<String> address;
    private Map<String, String> department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getDepartment() {
        return department;
    }

    public void setDepartment(Map<String, String> department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", address=" + address +
                ", department=" + department +
                '}';
    }
}


