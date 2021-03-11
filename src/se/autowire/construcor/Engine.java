package se.autowire.construcor;

public class Engine {
    private String modelYear;

    public Engine(String modelYear) {
        this.modelYear = modelYear;
    }
    public String getEngine() {
        return modelYear;
    }
}
