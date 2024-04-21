package org.io.code2go.DesignPattern.SolidPrinciple.InterfaceSegregationPrinciple;

/*
Interface Segregation Principle defines : A Client should not be forced to implement
 an Interface that it doesn't use. This Principle enhance extendability and re-usability
*/

public class InterfaceSPDriver {
    public static void main(String[] args) {
        Human human = new Human();
        human.works();
        human.sleep();

        Robot robot = new Robot();
        robot.works();
    }
}
