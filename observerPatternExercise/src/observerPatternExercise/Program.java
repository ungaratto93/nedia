package observerPatternExercise;

public class Program {
	public static void main(String[] args) {
		Temperature temp = new Temperature();
		temp.addObserver(new Thermometer());
		temp.addObserver(new Thermometer());
		
		temp.setTemp(10);
	}
}
