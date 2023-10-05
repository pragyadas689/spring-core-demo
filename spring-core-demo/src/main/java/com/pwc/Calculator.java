package com.pwc;

public class Calculator {
    private  int a;
    private  int b;

    public Calculator(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("constructor: int,int");
    }
    public  Calculator(double a,double b){
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("constructor: double,double");
    }

    public Calculator(String a,String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("constructor ; string , string");
    }

    public void sum(){
        System.out.println("a "+ a);
        System.out.println("b "+b);
        System.out.println("sum :"+(a+b));
    }
}
