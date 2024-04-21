package org.io.code2go.DesignPattern.SolidPrinciple.OpenCPr;

/*Open closed Principle : Defines that the class, method, etc. open for extension
and not for modifications*/

public class AreaDriver {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.calculate(new Rectangle(10, 20));
        areaCalculator.calculate(new Circle(5));
    }
}
