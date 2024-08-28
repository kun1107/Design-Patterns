package ObserverDesignPattern.obervable;

import ObserverDesignPattern.observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{

    private int stockCount = 0;
    private List<StockObserver> stockOberverList = new ArrayList<>();

    @Override
    public void add(StockObserver observerInterface) {
        stockOberverList.add(observerInterface);
    }

    @Override
    public void remove(StockObserver observerInterface) {
        stockOberverList.remove(observerInterface);
    }

    @Override
    public void notifyObserver() {
        for(StockObserver stockObserver: stockOberverList){
            stockObserver.update();
        }
    }

    @Override
    public void setStockCount(int count) {
        stockCount = stockCount + count;
        if(stockCount > 0) {
            notifyObserver();
        }

    }

    @Override
    public int getStockCount() { return stockCount;}
}
