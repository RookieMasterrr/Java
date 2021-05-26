package testPackage;


import com.github.sarxos.webcam.Webcam;


public class Video_Server {

	public static void main(String[] args) throws InterruptedException {
		Webcam webcam = Webcam.getDefault();
		webcam.open();
	}
}