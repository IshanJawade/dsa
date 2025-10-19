package lldDesignPatterns.ObserverDP.ObserversClass.Observers;

import lldDesignPatterns.ObserverDP.ObservableServer.Observable;
import lldDesignPatterns.ObserverDP.ObserversClass.Observer;

public class SMSObserver implements Observer{
    
    Observable obj;
    
    public SMSObserver(Observable _obj){
        this.obj = _obj;
    }

    public void update(){
        System.out.println("SMS notification received from change.");
    }
    
}
