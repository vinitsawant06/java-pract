package se.arraysDependancy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class ArrayDriverClass {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("se/arraysDependancy/resources/ArrayDependancy.xml");

        ArrayDependacy arrayDependacy = context.getBean("arrayDependancy", ArrayDependacy.class);

        System.out.println(Arrays.toString(arrayDependacy.getMyArray()));
        System.out.println(arrayDependacy.getCricketers());
        System.out.println(arrayDependacy.getFruits());
        System.out.println(arrayDependacy.getCountry_Capitals());
        System.out.println(arrayDependacy.getDrivers());
        arrayDependacy.pringCountry();
        System.out.println(arrayDependacy.getName());
    }
}
