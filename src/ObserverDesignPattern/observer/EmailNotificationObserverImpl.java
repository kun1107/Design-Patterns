package ObserverDesignPattern.observer;

import ObserverDesignPattern.obervable.StockObservable;

public class EmailNotificationObserverImpl implements StockObserver{

    StockObservable stockObservable;
    String emailId;

    public EmailNotificationObserverImpl(StockObservable stockObservable, String emailId){
        this.stockObservable = stockObservable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        System.out.println("Email sent with stock count "+ stockObservable.getStockCount()+ " to "+emailId);
    }
}
