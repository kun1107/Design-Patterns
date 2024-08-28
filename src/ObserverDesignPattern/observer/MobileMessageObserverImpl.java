package ObserverDesignPattern.observer;

import ObserverDesignPattern.obervable.StockObservable;

public class MobileMessageObserverImpl implements StockObserver{

    private int mobileNumber;
    private StockObservable stockObservable;

    public MobileMessageObserverImpl(int mobileNumber, StockObservable stockObservable){
        this.mobileNumber = mobileNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessageToMobile(mobileNumber,stockObservable.getStockCount());
    }

    private void sendMessageToMobile(int mobileNumber, int stockCount) {
        System.out.println("Message Sent to "+mobileNumber+ "Total Stock " +stockCount);
    }
}
