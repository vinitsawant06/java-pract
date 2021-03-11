package se.car;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    private String carName;
    private Engine engineName;


    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Autowired
    public void setEngineName(Engine engineName) {
        this.engineName = engineName;
    }

    public void print() {
        System.out.println("Car is: "+carName +" "+ "and it's engine is: "+engineName.getEngineName());
    }
}
