package Behavioral_Patterns.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Facebook implements SocialNetwork{

    private Map<Profile, List<Profile>> graph=new HashMap<>();
    public void addEdge(Profile source, Profile destination) {
        if (graph.containsKey(source)) {
            List<Profile> connections = graph.get(source);
            connections.add(destination);
        } else {
            List<Profile> connections = new ArrayList<>();
            connections.add(destination);
            graph.put(source, connections);
        }
    }

    public Map<Profile, List<Profile>> getGraph() {
        return graph;
    }

    public void setGraph(Map<Profile, List<Profile>> graph) {
        this.graph = graph;
    }

    @Override
    public ProfileIterator createFriendsIterator(Profile profile) {
        return new FacebookIterator(this,"friends",profile);
    }

    @Override
    public ProfileIterator createCoworkersIterator(Profile profile) {
        return new FacebookIterator(this,"coworkers",profile);
    }
}
