package Structural_Patterns.Proxy;

public class CachedYoutubeClass implements ThirdPartyYoutTubeLib{
    private ThirdPartyYoutTubeLib service;

    private  String listCache, videoCache;
    private boolean needReset=false,downloadExists=false;
    public CachedYoutubeClass(ThirdPartyYoutTubeLib service) {
        this.service = service;
    }


    @Override
    public String listVideos() {
        if(listCache==null || needReset){
            listCache=service.listVideos();
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(int id) {
        if(videoCache==null || needReset){
            videoCache=service.getVideoInfo(id);
        }
        return videoCache;
    }

    @Override
    public String downloadVideo(int id) {
        if(!downloadExists || needReset){
            service.downloadVideo(id);
        }
        return "downloaded successfully";
    }
}
