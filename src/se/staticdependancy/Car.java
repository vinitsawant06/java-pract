package se.staticdependancy;


import org.springframework.beans.factory.config.MethodInvokingFactoryBean;


public class Car {


    private static String name;

    public static void setName(String name) {
        Car.name = name;
    }

    public  void print() {
        System.out.println("Hello"+" "+name);
    }


}
