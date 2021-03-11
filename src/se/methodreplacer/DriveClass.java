package se.methodreplacer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriveClass {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("se/methodreplacer/resources/application.xml");

        Bank bank = context.getBean("b", Bank.class);
        bank.withdraw();
        bank.calInterest();
        bank.deposit();
        System.out.println(bank.getClass().getName());
    }
}
