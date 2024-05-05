package org.io.code2go.DesignPattern.SolidPrinciple.DependencyInversionPrinciple;

public class Logger implements ILogger{

    @Override
    public void logInformation(String logInfo) {
        System.out.println(logInfo);
    }
}
