package strategyPatternExercise;

public class Program {

	public static void main(String[] args) {
		File file = new File();
		System.out.println(file.getInputStrategy().getClass());

		file.setInputStrategy(new BufferedInputStrategy());
		System.out.println(file.getInputStrategy().getClass());
	}
	
}
