package Behavioral_Patterns.Iterator;

public class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;
    public void config(){
        network=new Facebook();
        spammer=new SocialSpammer();
    }

    public void SendsMessageToFriends(Profile profile){
        ProfileIterator iterator = network.createFriendsIterator(profile);
        spammer.send(iterator,"some text");
    }

    public void SendsSpamtoCowerkers(Profile profile){
        ProfileIterator iterator = network.createCoworkersIterator(profile);
        spammer.send(iterator,"some spams");
    }
}
