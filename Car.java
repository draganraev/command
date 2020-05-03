package homework;

public class Car {
	
	private boolean CarOn;
	
	public void SwitchOn(){
		System.out.println("The car is on");
		CarOn = true;
	}
	public void SwitchOff() {
		System.out.println("The car is off");
		CarOn = false;
	}
}
