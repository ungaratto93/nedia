package decoratorPatternExercise;

public class Program {
	public static void main(String[] args) {
		Channel c = new LogChannel(new ZipChannel(new TcpChannel()));
		c.send("OLÁ MUNDO");
		c.receive();
	}
}
