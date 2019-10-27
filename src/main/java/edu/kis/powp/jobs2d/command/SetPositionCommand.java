package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
		//driver command //
	
	int x;
	int y;
	Job2dDriver job2dDriver;
	
	 public SetPositionCommand(Job2dDriver e) {
		// TODO Auto-generated constructor stub
		 job2dDriver = e;
	}
	
	@Override
	public void execute()
	{
		job2dDriver.setPosition(x, y);
	}
	
}
