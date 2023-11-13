package multiple.name.method;

public interface CameraB {
	public void mark();
	default int numberOfPhotos() {
		return 24;
	}

}
