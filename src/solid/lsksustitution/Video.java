package solid.lsksustitution;

public class Video {
	private String title;
	private int time;
	private int likes;
	private int views;
	
	public Video() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public double getNumberOfHoursPlayed() {
		return (time / 3600.0) * views;
	}

	public void playRandomAd() throws Exception {
		System.out.println("Ramdom  video");
	}
}
