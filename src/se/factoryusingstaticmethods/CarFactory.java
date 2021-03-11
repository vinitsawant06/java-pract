package se.factoryusingstaticmethods;

public class CarFactory {
    public static String carname;

    public static void setCarname(String carname) {
        CarFactory.carname = carname;
    }

    public static Car getInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Car car = (Car) Class.forName(carname).newInstance();
        return car;
    }
}
