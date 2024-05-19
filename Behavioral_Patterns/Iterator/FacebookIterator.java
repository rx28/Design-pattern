package Behavioral_Patterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator{
    private Facebook facebook;
    private String type;

    private Profile profile;
    private int currentPosition;
    private List<Profile> cache=new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, Profile profile) {
        this.facebook = facebook;
        this.type = type;
        this.profile = profile;
    }
    private void lazyInit() {
        if (cache.isEmpty()) {
            Traversal tra = new DFS(); // You can change to BFS if needed
            cache = tra.getResult(facebook.getGraph(), profile);
        }
    }



    @Override
    public Profile getNext() {
        lazyInit(); // Ensure cache is initialized
        if (hasMore()) {
            return cache.get(currentPosition++);
        }
        return null;
    }



    @Override
    public boolean hasMore() {
        return currentPosition < cache.size();
    }

}
