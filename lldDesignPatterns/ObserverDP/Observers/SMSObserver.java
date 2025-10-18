package lldDesignPatterns.ObserverDP.Observers;

import lldDesignPatterns.ObserverDP.ObservableServer.Observable;

public class SMSObserver implements Observer{
    
    Observable obj;
    
    public SMSObserver(Observable _obj){
        this.obj = _obj;
    }

    public void update(){
        System.out.println("SMS notification received from change.");
    }
    
}
