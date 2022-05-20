package strategyPatternExercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamStrategy extends InputStrategy{

	@SuppressWarnings("unused")
	private FileInputStream stream;
	
	/*
	 * A FileInputStream obtains input bytes from a file in a file system.
	 * What files are available depends on the host environmen
	 * https://docs.oracle.com/javase/7/docs/api/java/io/FileInputStream.html
	 * */
	@Override
	void input(File file) throws FileNotFoundException {
		try {
			this.stream = new FileInputStream(file.path);
		} catch (FileNotFoundException e) {
			System.out.print(e);
		}
	}

}
