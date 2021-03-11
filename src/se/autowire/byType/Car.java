package se.autowire.byType;

public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void print() {
        System.out.println(engine.getModelYear());
    }
}
