package lldDesignPatterns.ObserverDP;

import lldDesignPatterns.ObserverDP.ObservableServer.Observable;
import lldDesignPatterns.ObserverDP.ObservableServer.ObservableImplementation;
import lldDesignPatterns.ObserverDP.Observers.EmailObserver;
import lldDesignPatterns.ObserverDP.Observers.SMSObserver;


public class Main {

    public static void main(String[] args) {
        
        Observable server = new ObservableImplementation();
        
        server.add( new EmailObserver(server) );
        server.add( new SMSObserver(server) );

        server.setData(100);
        server.setData(56);

    }
}