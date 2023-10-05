package com.pwc;

public class Employee {
    private  String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
    public void init(){
        System.out.println("init is called");
    }
    public void destroy(){
        System.out.println("destroy is called");
    }
}
