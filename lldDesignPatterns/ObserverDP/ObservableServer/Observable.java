package lldDesignPatterns.ObserverDP.ObservableServer;

public interface Observable {
    
    public void add(Observable obj);
    public void remove(Observable obj);
    public void setData(int data);
    public void notifyObservers();
}




