package state;

public class Robot implements RoboticState {
	private RoboticState state;

	public Robot(){
		setRoboticState(new stateOn(this));
	}

	public void setRoboticState(RoboticState state){
		this.state = state;
	}

	@Override
	public void walk() {
		state.walk();
	}

	@Override
	public void cook() {
		state.cook();
	}

	@Override
	public void off() {
		state.off();
	}

	public RoboticState getState() {
		return state;
	}

}