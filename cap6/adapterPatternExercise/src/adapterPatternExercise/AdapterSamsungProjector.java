package adapterPatternExercise;

public class AdapterSamsungProjector implements Projector {
	
	private SamsungProjector projector;
	
	public AdapterSamsungProjector(SamsungProjector projector) {
		this.projector = projector;
	}

	@Override
	public void start() {
		this.projector.turnOn();
	}
}
