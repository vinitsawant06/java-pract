package se.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

public class DriverClass {
    public static void main(String[] args) {
        /*
        To create object of singleton class use static method
         */
//        TestSingleton testSingleton = TestSingleton.getInstance();
//        TestSingleton testSingleton1 = TestSingleton.getInstance();
//        System.out.println(testSingleton==testSingleton1);

        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/singleton/resources/application.xml");

        TestSingleton testSingleton = context.getBean("testBean", TestSingleton.class);

        Calendar calendar = context.getBean("cal", Calendar.class);
        System.out.println(calendar.getCalendarType());

        //Calendar in util class is a singleton class
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getCalendarType());



    }
}
