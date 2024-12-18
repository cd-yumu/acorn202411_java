package test.mypac;

public class AndroidPhone extends HandPhone{
	
	// Constructor
	public AndroidPhone() {
		System.out.println("Called AndroidPhone Constructor");
	}
	
	public void doInternet() {
		System.out.println("Surfing Internet");
	}
	
	@Override
	public void takePicture() {
//		super.takePicture();
		System.out.println("Taking a picture to 1000mil px");
	}
	
	
}
