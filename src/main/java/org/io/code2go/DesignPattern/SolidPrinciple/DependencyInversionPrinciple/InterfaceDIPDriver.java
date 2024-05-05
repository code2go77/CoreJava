package org.io.code2go.DesignPattern.SolidPrinciple.DependencyInversionPrinciple;

/*
Inverting the design where Lower level modules defining interface that Higher level
modules depends on. So we get; higher level modules which defines the interfaces that
lower modules implements.
*/
public class InterfaceDIPDriver {
    public static void main(String[] args) {
        LogToFile logToFile = new LogToFile(new Logger());
        logToFile.logging();

        LogToDb logToDb = new LogToDb(new Logger());
        logToDb.logging();
    }

}
