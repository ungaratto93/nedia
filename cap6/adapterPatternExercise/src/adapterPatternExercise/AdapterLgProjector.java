package adapterPatternExercise;

public class AdapterLgProjector implements Projector {

	private LgProjector projector;
	
	public AdapterLgProjector(LgProjector projector) {
		this.projector = projector;
	}

	@Override
	public void start() {
		this.projector.enable(60);
	}
}
