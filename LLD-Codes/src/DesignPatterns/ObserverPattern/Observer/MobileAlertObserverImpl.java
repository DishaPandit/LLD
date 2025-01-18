package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String name, StocksObservable observable){
        this.userName = name;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is in stock, hurry up");
    }

    private void sendMsgOnMobile(String userName, String msg){
        System.out.println("Message sent to : "+ userName);
    }
}
