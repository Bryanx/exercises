package state;

public class StateCook implements RoboticState {
	private final Robot robot;
	
	public StateCook(Robot robot){
		this.robot = robot;
	}
	 
	@Override
	public void walk() {
		System.out.println("Walking...");
		robot.setRoboticState(new stateOn(robot));
	}

	@Override
	public void cook() {
		System.out.println("Cooking...");
	}

	@Override
	public void off() {
		System.out.println("Cannot switched off while cooking...");
	}
}
