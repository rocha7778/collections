package multiple.name.method;

public interface CameraA {
	public void brand();
	default int numberOfPhotos() {
		return 12;
	}

}
