package multiple.name.method;

public class Sonic implements CameraA, CameraB {

	@Override
	public void mark() {
		// TODO Auto-generated method stub

	}

	@Override
	public void brand() {
		// TODO Auto-generated method stub

	}

	@Override
	public int numberOfPhotos() {
		// TODO Auto-generated method stub
		return CameraB.super.numberOfPhotos();
	}

}
