package decoratorPatternExercise;

public class UdpChannel implements Channel {

	@Override
	public void send(String msg) {
		System.out.println("[UDP] Sending data...");
	}

	@Override
	public String receive() {
		System.out.println("[UDP] Receiving data...");
		return null;
	}

}
