package decoratorPatternExercise;

public class ChannelDecorator implements Channel {

	private Channel channel;
	
	public ChannelDecorator(Channel channel) {
		this.channel = channel;
	}

	@Override
	public void send(String msg) {
		System.out.println("decorator");
		channel.send(msg);
	}

	@Override
	public String receive() {
		channel.receive();
		return null;
	}

}
