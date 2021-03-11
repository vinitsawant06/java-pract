package se.sterotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private Engine engine;

    public void printData() {
        System.out.println(engine.getModel());
    }

}
