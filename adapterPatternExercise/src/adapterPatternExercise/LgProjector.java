package adapterPatternExercise;

public class LgProjector {

	@SuppressWarnings("unused")
	private int timer = 0;
	
	public void enable(int timer) {
		this.timer = timer;
	}

	public void disable() {
		this.timer = 0;
	}
}
