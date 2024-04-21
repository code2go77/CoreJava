package org.io.code2go.DesignPattern.SolidPrinciple.InterfaceSegregationPrinciple;

public class Human implements Worker, Sleep{
    @Override
    public void sleep() {
        System.out.println("sleep time");
    }

    @Override
    public void works() {
        System.out.println("currently employee is working");
    }
}
