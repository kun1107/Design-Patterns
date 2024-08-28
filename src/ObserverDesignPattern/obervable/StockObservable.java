package ObserverDesignPattern.obervable;

import ObserverDesignPattern.observer.StockObserver;

public interface StockObservable {

    void add(StockObserver observerInterface);

    void remove(StockObserver observerInterface);

    void notifyObserver();

    void setStockCount( int count);

    int getStockCount();

}
