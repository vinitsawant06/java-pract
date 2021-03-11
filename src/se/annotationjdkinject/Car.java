package se.annotationjdkinject;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;

public class Car {
    @Inject
    @Qualifier("e1")
    public Engine engine;
}
