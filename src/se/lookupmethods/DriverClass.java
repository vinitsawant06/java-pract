package se.lookupmethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/lookupmethods/resource/application.xml");

        Car c = context.getBean("c", Car.class);
        System.out.println(c.myCarEngine().getName());
        System.out.println(c.getClass().getCanonicalName());

        Bus bus = context.getBean("b", Bus.class);
        System.out.println(bus.myBusEngine().getName());

        Truck t = context.getBean("t", Truck.class);
        System.out.println(t.myTruckEngine().getName());
    }
}
