package decoratorPatternExercise;

public class LogChannel extends ChannelDecorator{

	public LogChannel(Channel channel) {
		super(channel);
	}

	private void info(String msg) {
		System.out.println("[LOG] [INFO] logging data... " + msg);
	}
	
	public void send(String msg) {
		info(msg);
		super.send(msg);
	}

	public String receive() {
		String msg = super.receive();
		info(msg);
		return msg;
	}
}
