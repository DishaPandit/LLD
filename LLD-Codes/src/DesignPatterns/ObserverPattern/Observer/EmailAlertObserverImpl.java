package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    //so that update() can be called without parameter, no use of instanceOf method
    StocksObservable observable;

    public EmailAlertObserverImpl(String email, StocksObservable observable){
        this.emailId = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in stock, hurry up");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("Mail sent to : " + emailId);
    }
}
