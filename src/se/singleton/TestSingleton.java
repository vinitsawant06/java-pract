package se.singleton;

/**
 * A class is said to be singleton if it contains private constructor
 * and a static method to return Object but only one, for the second time it
 * will return the already created object
 */
public class TestSingleton {
    private static TestSingleton test;

    private TestSingleton() {
        System.out.println("Test SingleTon Object");
    }

    public static TestSingleton getInstance() {
        if(test == null) {
            return new TestSingleton();
//            return test;

        } else {
            return test;
        }
    }
}
