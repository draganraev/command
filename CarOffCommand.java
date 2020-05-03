package homework;

public class CarOffCommand implements Command {
	
	Car car;
	
	public CarOffCommand(Car car){
		this.car = car;
	}
	
	public void execute(){
		this.car.SwitchOff();
	}

}
