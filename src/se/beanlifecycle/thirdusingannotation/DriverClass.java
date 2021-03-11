package se.beanlifecycle.thirdusingannotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.beanlifecycle.firstusingprogrammatic.Test;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("se/beanlifecycle/firstusingprogrammatic/resource/application.xml");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 for save and 2 for close");
            int key=scanner.nextInt();
            switch (key) {
                case 1: Test test = context.getBean("t", Test.class);
                        System.out.println("Enter id: ");
                        int id = scanner.nextInt();
                        System.out.println("Enter id: ");
                        String name = scanner.next();
                        System.out.println("Enter id: ");
                        String mail = scanner.next();
                        System.out.println("Enter id: ");
                        String address = scanner.next();
                        test.save(id, name, mail, address);
                        break;

                case 2: context.close();
                break;
            }
        }

    }
}
