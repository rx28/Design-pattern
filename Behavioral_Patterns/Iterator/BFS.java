package Behavioral_Patterns.Iterator;

import java.util.*;

public class BFS implements Traversal{
    public List<Profile> res=new ArrayList<>();
    @Override
    public List<Profile> getResult(Map<Profile, List<Profile>> graph,Profile start) {


        Queue<Profile> queue = new LinkedList<>();
        Set<Profile> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Profile current = queue.poll();
            res.add(current);

            List<Profile> neighbors = graph.getOrDefault(current, new ArrayList<>());
            for (Profile neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return res;

    }
}
