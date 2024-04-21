package org.io.code2go.DesignPattern.SolidPrinciple.SingleResponsibilityPrinciple;

/*Single Responsibility Principle: Defines the Class is
 only responsible for individual task with No additional Tasks*/


public class TaskDriver {
    public static void main(String[] args) {
        Scheduller scheduller = new Scheduller(new Compute(), new SaveToDb(), new SendNotification());
        scheduller.schedule();
    }
}
