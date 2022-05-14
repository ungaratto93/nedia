package adapterPatternExercise;

public class SamsungProjector {

	@SuppressWarnings("unused")
	private Boolean on = false;
	
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
	}
}
