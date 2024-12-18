package test.mypac;

public class IosPhone extends HandPhone{

	public void faceRecognize() {
		super.takePicture();
		System.out.println("Face is correct!\n");
		
	}
	
	public void kakakoTalk() {
		System.out.println("Please Login Kakao Talk.\n");
	}
	
	@Override
	public void takePicture() {
		System.out.println("Taking a Picture of 1000mil px.");
		System.out.println("Add camera filter. - more moody\n");
	}
	
	@Override
	public void call() {
		super.call();
		System.out.println("(but you can not recording voice.)\n");
	}
	
	
	
}
