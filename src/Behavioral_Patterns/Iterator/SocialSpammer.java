package Behavioral_Patterns.Iterator;

public class SocialSpammer {
    public void send(ProfileIterator iterator,String message){
        while(iterator.hasMore()){
            Profile profile=iterator.getNext();
            System.out.println(profile.toString()
                    +message);
        }
    }
}
