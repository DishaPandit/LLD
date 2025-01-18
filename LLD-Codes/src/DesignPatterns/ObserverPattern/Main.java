package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import DesignPatterns.ObserverPattern.Observable.StocksObservable;
import DesignPatterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class Main {

    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("dishapandit1998@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("sorbydv97@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);

        iphoneStockObservable.setStockCount(10);
    }
}
