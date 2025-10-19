package lldDesignPatterns.ObserverDP.ObservableServer;

import lldDesignPatterns.ObserverDP.ObserversClass.Observer;

public interface Observable {
    public void add(Observer obj);
    public void remove(Observer obj);
    public void notifyObservers();
    public void setData(int data);
}
