package se.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/sterotype/resources/application.xml");

        Car car = context.getBean(Car.class);
        car.printData();



    }
}
