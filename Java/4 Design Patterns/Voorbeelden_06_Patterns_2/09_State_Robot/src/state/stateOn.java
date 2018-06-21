package state;

public class stateOn implements RoboticState {
	private final Robot robot;
	
	public stateOn(Robot robot){
		this.robot = robot;
	}
	 
	@Override
	public void walk() {
		System.out.println("Walking...");
	}

	@Override
	public void cook() {
		System.out.println("Cooking...");
		robot.setRoboticState(new StateCook(robot));
	}

	@Override
	public void off() {
		robot.setRoboticState(new StateOff(robot));
		System.out.println("Robot is switched off");
	}

}
