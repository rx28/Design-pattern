package Structural_Patterns.Proxy;

public class YoutubeManager {

    protected ThirdPartyYoutTubeLib service;

    public YoutubeManager(ThirdPartyYoutTubeLib service) {
        this.service = service;
    }
    public String renderVideoPage(int id){
        return service.getVideoInfo(id);
    }
    public String renderListPanel(){
        return service.listVideos();
    }

}
