package lldDesignPatterns.ObserverDP.Observers;

import lldDesignPatterns.ObserverDP.ObservableServer.Observable;

public class EmailObserver implements Observer{
    Observable obj;

    public EmailObserver(Observable _obj){
        this.obj = _obj;
    }

    public void update(){
        System.out.println("Email notification received from change.");
    }

}
