package strategyPatternExercise;

public class File {

	private InputStrategy strategy;
	public String path;
	
	public File() {
		strategy = new FileInputStreamStrategy();
	}

	public void setInputStrategy(InputStrategy inputStrategy) {
		this.strategy = inputStrategy;
	}

	public InputStrategy getInputStrategy() {
		return this.strategy;
	}
}
