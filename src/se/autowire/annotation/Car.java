package se.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {



    @Autowired
    @Qualifier("e1")
    private Engine engine;


//    public Car() {
//    }
//
//    public Car( Engine engine) {
//        this.engine = engine;
//    }


    public Engine getEngine() {
        return engine;
    }
//    @Autowired
//    public void setEngine( @Qualifier ("e1") Engine engine) {
//        this.engine = engine;
//    }
}
