package Behavioral_Patterns.Iterator;

import java.util.*;

public class DFS implements Traversal {
    private List<Profile> res= new ArrayList<>();

    @Override
    public List<Profile> getResult(Map<Profile, List<Profile>> graph, Profile start) {
        Set<Profile> visited = new HashSet<>();
        Stack<Profile> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            Profile current = stack.pop();
            if (!visited.contains(current)) {
                res.add(current);
                visited.add(current);

                List<Profile> neighbors = graph.getOrDefault(current, new ArrayList<>());
                for (Profile neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    return res;
    }


}
