package lldDesignPatterns.ObserverDP;

import lldDesignPatterns.ObserverDP.ObservableServer.Observable;
import lldDesignPatterns.ObserverDP.ObservableServer.ObservableServer;
import lldDesignPatterns.ObserverDP.ObserversClass.Observers.EmailObserver;
import lldDesignPatterns.ObserverDP.ObserversClass.Observers.SMSObserver;


public class Main {

    public static void main(String[] args) {
        
        Observable server = new ObservableServer();
        
        server.add( new EmailObserver(server) );
        server.add( new SMSObserver(server) );

        server.setData(100);
        server.setData(56);

    }
}