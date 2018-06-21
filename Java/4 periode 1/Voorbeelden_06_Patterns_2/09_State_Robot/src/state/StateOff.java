package state;

public class StateOff implements RoboticState {
	private final Robot robot;
	
	public StateOff(Robot robot){
		this.robot = robot;
	}
	 
	@Override
	public void walk() {
		System.out.println("Walking...");
		robot.setRoboticState(new stateOn(robot));
	}

	@Override
	public void cook() {
		System.out.println("Cannot cook at Off state.");
	}

	@Override
	public void off() {
		System.out.println("Already switched off...");
	}
}
