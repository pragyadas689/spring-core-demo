package com.pwc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //Student student = (Student) context.getBean("student1");
        //Product product = (Product) context.getBean("product1");
        Calculator calculator = (Calculator) context.getBean("calculator1", Calculator.class) ;
        calculator.sum();
    }
}
