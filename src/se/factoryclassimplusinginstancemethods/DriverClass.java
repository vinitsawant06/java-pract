package se.factoryclassimplusinginstancemethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/factoryclassimplusinginstancemethods/resources/application.xml");

        Car c = context.getBean("c", Car.class);
        c.drive();
    }
}
