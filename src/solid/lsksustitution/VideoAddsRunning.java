package solid.lsksustitution;

import java.util.ArrayList;
import java.util.List;

public class VideoAddsRunning {

	public static void main(String[] args) throws Exception {

		List<Video> videos = new ArrayList<>();
		videos.add(new Video());
		videos.add(new VideoPremium());
		
		for (Video video : videos) {
			video.playRandomAd();
		}

	}

}
