package se.car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {

        //To load using 2 XML files for 2 different beans
        String[] files =  {"se/car/resources/car.xml", "se/car/resources/engine.xml"};
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(files);

        //To load using single XML files for both beans
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("se/car/resources/car-engine.xml");

        Engine engine = context.getBean("engineBean", Engine.class);
        System.out.println(engine.getEngineName());

        Car car = context.getBean("carBean", Car.class);
        car.print();


    }
}
