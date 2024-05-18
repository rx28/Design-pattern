package Behavioral_Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<User> user=new ArrayList<>();

        user.add(new User(1,"a"));
        user.add(new User(2,"b"));
        user.add(new User(3,"c"));
        Publishers publishers=new Publishers();
        for(var i: user){
            publishers.subscribe("demo",i);
        }
        publishers.notifySubscriber("demo","You are successfully subscribed");
        for(var i:user){
            System.out.println(i.toString()+i.getMessage());
        }

    }
}
