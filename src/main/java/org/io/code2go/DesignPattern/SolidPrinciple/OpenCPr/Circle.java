package org.io.code2go.DesignPattern.SolidPrinciple.OpenCPr;

public class Circle extends Shape {
    private double raidus;
    private double pi = 3.14;

    public Circle(double raidus) {
        this.raidus = raidus;
    }

    @Override
    void calculateArea() {
        System.out.println(pi * raidus * raidus);
    }
}
