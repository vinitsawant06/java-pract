package se.annotationjdkresource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverCla {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/annotationjdkresource/resource/application.xml");

        Car car = context.getBean("c", Car.class);
        System.out.println(car.engine.getModelName());
    }
}
