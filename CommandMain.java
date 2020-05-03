package homework;

public class CommandMain {
	
	public static void main(String[] args) {
		
		Controller controller = new Controller();
		Car car = new Car();
		
		Command CarOn = new CarOnCommand(car);
		Command CarOff = new CarOffCommand(car);
		
		controller.setCommand(CarOn);
		controller.pressButton();
		
		controller.setCommand(CarOff);
		controller.pressButton();

		
	}

}
