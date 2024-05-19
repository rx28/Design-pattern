package Structural_Patterns.Proxy;

public class Runner {
    public static void main(String[] args) {
        ThirdPartyYoutTubeLib service = new ThirdPartyYoutubeClass();
        ThirdPartyYoutTubeLib cachedService = new CachedYoutubeClass(service);

        System.out.println("Direct service (ThirdPartyYoutubeClass):");
        System.out.println("List of videos: " + service.listVideos());
        System.out.println("Video info (id=1): " + service.getVideoInfo(1));
        System.out.println("Download video (id=2): " + service.downloadVideo(2));

        System.out.println("\nCached service (CachedYoutubeClass):");
        System.out.println("List of videos: " + cachedService.listVideos());
        System.out.println("Video info (id=1): " + cachedService.getVideoInfo(1));
        System.out.println("Download video (id=2): " + cachedService.downloadVideo(2));

        System.out.println("\nCached service (CachedYoutubeClass) - second call:");
        System.out.println("List of videos: " + cachedService.listVideos());
        System.out.println("Video info (id=1): " + cachedService.getVideoInfo(1));
        System.out.println("Download video (id=2): " + cachedService.downloadVideo(2));
    }
}
