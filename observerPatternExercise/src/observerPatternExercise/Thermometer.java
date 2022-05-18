package observerPatternExercise;

public class Thermometer implements Observer {

	@Override
	public void update(Subject s) {
		double temp =  ((Temperature) s).getTemp();
		System.out.println("[UPDATE] THERMOMETER " + temp + "º C");
	}

}
