package org.io.code2go.DesignPattern.SolidPrinciple.SRP;

public class Scheduller {
    Compute compute;
    SaveToDb saveToDb;
    SendNotification sendNotification;

    public Scheduller(Compute c, SaveToDb s, SendNotification n) {
        this.compute = c;
        this.saveToDb = s;
        this.sendNotification = n;
    }

    public void schedule() {
        System.out.println(compute.compute());
        System.out.println(saveToDb.saveToDb());
        System.out.println(sendNotification.sendNotification());
    }
}
