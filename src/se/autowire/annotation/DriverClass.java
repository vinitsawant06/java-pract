package se.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/autowire/annotation/resources/application.xml");

        Car c = context.getBean("c", Car.class);
        System.out.println(c.getEngine().getModelYear());
    }
}
