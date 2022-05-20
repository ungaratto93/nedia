package strategyPatternExercise;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStrategy extends InputStrategy {

	@SuppressWarnings("unused")
	private BufferedInputStream stream;
	
	/*
	 * A BufferedInputStream adds functionality to another input stream-namely,
	 * the ability to buffer the input and to support the mark and reset methods. 
	 * When the BufferedInputStream is created, an internal buffer array is created
	 * https://docs.oracle.com/javase/7/docs/api/java/io/BufferedInputStream.html
	 * */
	@Override
	void input(File file) {
		try {
			this.stream = new BufferedInputStream(new FileInputStream(file.path));
		} catch (FileNotFoundException e) {
			System.out.print(false);
		}
	}

}
