package strategyPatternExercise;

import java.io.FileNotFoundException;

public abstract class InputStrategy {

	abstract void input(File file) throws FileNotFoundException;

}
