package se.autowire.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/autowire/byType/resources/application.xml");
        Car car = context.getBean("c", Car.class);

        car.print();
    }
}

