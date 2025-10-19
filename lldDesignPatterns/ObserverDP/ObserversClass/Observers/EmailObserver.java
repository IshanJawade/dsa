package lldDesignPatterns.ObserverDP.ObserversClass.Observers;

import lldDesignPatterns.ObserverDP.ObservableServer.Observable;
import lldDesignPatterns.ObserverDP.ObserversClass.Observer;

public class EmailObserver implements Observer{
    Observable obj;

    public EmailObserver(Observable _obj){
        this.obj = _obj;
    }

    public void update(){
        System.out.println("Email notification received from change.");
    }

}
