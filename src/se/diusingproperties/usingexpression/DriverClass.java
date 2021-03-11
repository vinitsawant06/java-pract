package se.diusingproperties.usingexpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/diusingproperties/usingexpression/resources/application.xml");
        Test test = context.getBean("t", Test.class);
        test.creteConnection();
    }
}
