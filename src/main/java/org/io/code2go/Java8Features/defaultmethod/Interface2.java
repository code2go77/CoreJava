package org.io.code2go.Java8Features.defaultmethod;

@FunctionalInterface
public interface Interface2 {

    void method2();

    default void log (String str) {
        System.out.println("I2 logging::"+str);
    }
}
