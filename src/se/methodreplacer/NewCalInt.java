package se.methodreplacer;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class NewCalInt implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("New cal interest from new class NewCalInt");

        return o;
    }
}
