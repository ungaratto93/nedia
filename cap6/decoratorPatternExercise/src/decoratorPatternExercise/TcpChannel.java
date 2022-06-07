package decoratorPatternExercise;

public class TcpChannel implements Channel {

	@Override
	public void send(String msg) {
		System.out.println("[TCP] Sending data...");
	}

	@Override
	public String receive() {
		System.out.println("[TCP] Receiving data...");
		return null;
	}

}
