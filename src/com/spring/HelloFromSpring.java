package com.spring;

public class HelloFromSpring {

    private String gender;
    private int age;

    public HelloFromSpring(String gender) {
        this.gender = gender;
    }

    public HelloFromSpring (int age) {
        this.age = age;
    }

//    public HelloFromSpring() {
//        System.out.println("Spring constructor!");
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }

    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    public void m1() {
        System.out.println("Hello from spring!");
    }
}

