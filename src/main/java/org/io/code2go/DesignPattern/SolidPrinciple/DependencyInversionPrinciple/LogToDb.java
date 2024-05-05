package org.io.code2go.DesignPattern.SolidPrinciple.DependencyInversionPrinciple;

public class LogToDb {
    private Logger logger;
    public LogToDb(Logger logger) {
        this.logger = logger;
    }
    public void logging() {
        logger.logInformation("Printing To database..");

    }


}
