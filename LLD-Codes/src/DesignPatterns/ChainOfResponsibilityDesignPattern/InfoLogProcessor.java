package DesignPatterns.ChainOfResponsibilityDesignPattern;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == INFO){
            System.out.println("INFO : " + message);
        }
        else{
            //go to next log processor
            super.log(logLevel,message);
        }
    }
}
