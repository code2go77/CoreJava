package org.io.code2go.DesignPattern.SolidPrinciple.DependencyInversionPrinciple;

public class LogToFile {
    private Logger logger;

    public LogToFile(Logger logger) {
        this.logger = logger;
    }

    public void logging() {
        logger.logInformation("Printing To file..");

    }
}
