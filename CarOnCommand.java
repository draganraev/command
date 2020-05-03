package homework;

public class CarOnCommand implements Command {
				
	Car car;
	
	public CarOnCommand(Car car){
		this.car = car;
	}
	
	public void execute(){
		this.car.SwitchOn();
	}
}
