package se.factoryclassimplusinginstancemethods;


public class CarFactory {

    public static String carname;

    public void setCarname(String carname) {
        CarFactory.carname = carname;
    }

    public Car getInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Car car = (Car) Class.forName(carname).newInstance();
        return car;
    }


}
