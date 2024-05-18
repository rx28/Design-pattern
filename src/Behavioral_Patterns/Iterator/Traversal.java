package Behavioral_Patterns.Iterator;

import java.util.List;
import java.util.Map;

public interface Traversal {
    public List<Profile> getResult(Map<Profile, List<Profile>> graph, Profile start);
}
