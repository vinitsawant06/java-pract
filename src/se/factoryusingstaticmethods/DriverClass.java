package se.factoryusingstaticmethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/factoryusingstaticmethods/resource/application.xml");

        Car car = context.getBean("cf", Car.class);
        car.drive();

    }
}
