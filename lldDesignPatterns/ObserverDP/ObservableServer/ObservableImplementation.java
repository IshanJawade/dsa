package lldDesignPatterns.ObserverDP.ObservableServer;

import lldDesignPatterns.ObserverDP.Observers.Observer;
import java.util.ArrayList;
import java.util.List;



public class ObservableImplementation implements Observable{
    
    List <Observer> clients = new ArrayList<>();
    int price = 0;

    public void add(Observer obj){
        clients.add(obj);
    }

    public void remove(Observer obj){
        for(int i=0; i<clients.size(); i++){
            if(clients.get(i) == obj){
                clients.remove(i);
            }
        }
    }

    @Override
    public void notifyObservers(){
        for(Observer o: clients){
            o.update();
        }
    }
    
    @Override
    public void setData(int data){
        price = data;
        notifyObservers();
    }

}
