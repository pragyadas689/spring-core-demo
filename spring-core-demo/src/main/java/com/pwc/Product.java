package com.pwc;

public class Product {
    private int pid;
    private String productName;
    private Category category;


    public Product(int pid,String productName,Category category){
        this.pid = pid;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", productName='" + productName + '\'' +
                ", category=" + category +
                '}';
    }
}
