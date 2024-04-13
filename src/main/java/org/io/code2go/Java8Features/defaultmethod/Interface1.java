package org.io.code2go.Java8Features.defaultmethod;

@FunctionalInterface
public interface Interface1 {
    void method1(String str);

    default void log(String str) {
        System.out.println("I1 logging::"+str);
    }

    static  void print(String str) {
        System.out.println("Printing from Interface 1 "+str);
    }
}
