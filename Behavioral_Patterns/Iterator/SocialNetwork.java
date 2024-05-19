package Behavioral_Patterns.Iterator;

public interface SocialNetwork {
    public ProfileIterator createFriendsIterator(Profile profile);
    public ProfileIterator createCoworkersIterator(Profile profile);

}