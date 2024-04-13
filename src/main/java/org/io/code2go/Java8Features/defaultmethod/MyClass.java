package org.io.code2go.Java8Features.defaultmethod;

public class MyClass implements Interface1, Interface2{
    @Override
    public void method1(String str) {
        System.out.println("method1 of interface1");
    }

    @Override
    public void method2() {
        System.out.println("method2 of interface2");
    }

    @Override
    public void log(String str) {
        System.out.println("MyClass logging::"+str);
        Interface1.print("abc");
    }
}
