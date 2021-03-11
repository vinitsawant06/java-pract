package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {
    public static void main(String[] args) {
        //Using J2EE ApplicationContext container of IoC

        //1. Load xml file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("resources/application.xml");


        //2.Retrieve Beans from XML

//        HelloFromSpring hello = context.getBean("myHello", HelloFromSpring.class);
//        HelloFromSpring hello1 = context.getBean("myHello", HelloFromSpring.class);
//        HelloFromSpring hello2 = context.getBean("myHello", HelloFromSpring.class);
//        HelloFromSpring hello3 = context.getBean("myHello", HelloFromSpring.class);
//        hello.m1();
//        hello1.m1();
//        hello2.m1();
//        hello3.m1();

        //To set and get value of gender using property
        HelloFromSpring helloGender = context.getBean("helloGender", HelloFromSpring.class);
        System.out.println(helloGender.getGender());
        System.out.println(helloGender.getAge());

        HelloFromSpring helloAge = context.getBean("helloGenderAge", HelloFromSpring.class);
        System.out.println(helloAge.getAge());


        //3. Close the context
        context.close();


        //Using Core or BeanFactory container of IoC
//        Resource resource = new ClassPathResource("resources/application.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        factory.getBean("myHello");
    }
}
