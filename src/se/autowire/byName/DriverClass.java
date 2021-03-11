package se.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/autowire/byName/resources/application.xml");

        Car car = context.getBean("c", Car.class);

        System.out.println(car.getEngine().getModelYear());
    }
}
