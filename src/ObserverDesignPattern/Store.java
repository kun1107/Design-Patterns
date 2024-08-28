package ObserverDesignPattern;

import ObserverDesignPattern.obervable.IphoneStockObservable;
import ObserverDesignPattern.obervable.StockObservable;
import ObserverDesignPattern.observer.EmailNotificationObserverImpl;
import ObserverDesignPattern.observer.MobileMessageObserverImpl;
import ObserverDesignPattern.observer.StockObserver;

public class Store {
    public static void main(String[] args) {

        StockObservable stockObservable =  new IphoneStockObservable();

        StockObserver stockObserver1 = new EmailNotificationObserverImpl(stockObservable, "xyz@gmail.com");
        StockObserver stockObserver2 = new MobileMessageObserverImpl(1234532, stockObservable);

        stockObservable.add(stockObserver1);
        stockObservable.add(stockObserver2);
        stockObservable.setStockCount(10);
        //stockObservable.setStockCount(0);
        stockObservable.setStockCount(100);

    }
}
