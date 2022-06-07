package observerPatternExercise;


public class Temperature extends Subject{

	private double temp;
	
	public double getTemp() {
		return this.temp;
	}
	
	public void setTemp(double temp) {
		this.temp = temp;
		notifyObservers();
	}
}
