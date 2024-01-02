package exceptions.test;

import java.io.IOException;

class AirPlane {
	public AirPlane() throws IOException {
		System.out.print("AirPlane");
		throw new IOException();
	}
}