package org.io.code2go.DesignPattern.SolidPrinciple.InterfaceSegregationPrinciple;

public class Robot implements Worker{
    @Override
    public void works() {
        System.out.println("currently robot is working");
    }
}
