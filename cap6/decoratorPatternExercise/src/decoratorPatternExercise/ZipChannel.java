package decoratorPatternExercise;

public class ZipChannel extends ChannelDecorator {

	public ZipChannel(Channel channel) {
		super(channel);
	}

	public void send(String msg) {
		System.out.println("[ZIP] zipping data...");
		super.send(msg);
	}

	public String receive() {
		String msg = super.receive();
		System.out.println("[ZIP] unzipping data...");
		return msg;
	}
}
