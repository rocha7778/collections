package solid.lsksustitution;

public class VideoPremium  extends Video{
	
	private boolean isPremium = true;
	
	public VideoPremium() {
		super();
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	@Override
	public void playRandomAd() throws Exception {
		if(!isPremium) {
			super.playRandomAd();
		}
	}
	
	

}
