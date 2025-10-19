package lldDesignPatterns.ObserverDP.ObservableServer;

import java.util.ArrayList;
import java.util.List;

import lldDesignPatterns.ObserverDP.ObserversClass.Observer;

public class ObservableServer implements Observable{

    List<Observer> clients = new ArrayList<>();
    int price =0;

    public void add(Observer _obj){
        clients.add(_obj);
    }

    public void remove(Observer _obj){
        for( int i = 0; i < clients.size(); i++ ){
            if(clients.get(i).equals(_obj)){
                clients.remove(i);
            }
        }
    }

    public void notifyObservers(){
        for(Observer i : clients){
            i.update();
        }
    }

    public void setData(int _price){
        price = _price;
        notifyObservers();
    }
}
