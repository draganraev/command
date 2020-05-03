package homework;

public class Controller {
private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void pressButton(){
		System.out.println("Execute command");
		this.command.execute();
	}

}
