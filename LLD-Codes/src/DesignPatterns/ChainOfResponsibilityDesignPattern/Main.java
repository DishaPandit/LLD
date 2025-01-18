package DesignPatterns.ChainOfResponsibilityDesignPattern;

public class Main {

    public static void main(String[] args) {

        LogProcessor logObject  = new InfoLogProcessor(new DebugLogProcessor( new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR,"Exception occurred");
        logObject.log(LogProcessor.DEBUG,"Debugging Required");
        logObject.log(LogProcessor.INFO,"Just for information");

    }
}
