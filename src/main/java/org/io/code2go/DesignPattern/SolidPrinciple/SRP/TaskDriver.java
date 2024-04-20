package org.io.code2go.DesignPattern.SolidPrinciple.SRP;

public class TaskDriver {
    public static void main(String[] args) {
        Scheduller scheduller = new Scheduller(new Compute(), new SaveToDb(), new SendNotification());
        scheduller.schedule();
    }
}
