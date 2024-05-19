package Behavioral_Patterns.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Publishers {
    HashMap<String,List<User>>listeners=new HashMap<String, List<User>>();

    public void subscribe(String event, User listener){
        if (!listeners.containsKey(event)) {
             listeners.put(event, new ArrayList<>());
        }
        listeners.get(event).add(listener);
    }

    public void unsubscribe(String event, User listener){
        if(listeners.containsKey(event)){
            listeners.get(event).remove(listener);
        }

    }

    public void notifySubscriber(String event , String data){
        for(User u:listeners.get(event)){
            u.update(this,data);
        }
    }




}
