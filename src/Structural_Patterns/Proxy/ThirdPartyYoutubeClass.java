package Structural_Patterns.Proxy;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutTubeLib{

    HashMap<Integer,String > list=new HashMap<>();
    public ThirdPartyYoutubeClass() {
        list.put(1, "Video 1 Description");
        list.put(2, "Video 2 Description");
        list.put(3, "Video 3 Description");
    }
    @Override
    public String listVideos() {
      return list.values().toString();
    }

    @Override
    public String getVideoInfo(int id) {
        return list.get(id);
    }

    @Override
    public String downloadVideo(int id) {
        return list.get(id);
    }
}
