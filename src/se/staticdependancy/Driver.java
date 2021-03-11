package se.staticdependancy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/staticdependancy/resources/application.xml");

        Car car = context.getBean("c", Car.class);

        car.print();



    }
}
