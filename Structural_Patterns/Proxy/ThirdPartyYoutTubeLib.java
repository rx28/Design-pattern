package Structural_Patterns.Proxy;

public interface ThirdPartyYoutTubeLib {

    public String listVideos();

    public String getVideoInfo(int id);

    public String downloadVideo(int id);
}
