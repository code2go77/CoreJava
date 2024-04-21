package org.io.code2go.DesignPattern.SolidPrinciple.OpenCPr;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    void calculateArea() {
        System.out.println(height * width);
    }
}
