package adapterPatternExercise;

public class Program {
	public static void main(String[] args) {
		
		Client client = new Client();

		LgProjector lgProjector = new LgProjector();
		AdapterLgProjector adapterLgProjector = new AdapterLgProjector(lgProjector);

		SamsungProjector samsungProjector = new SamsungProjector();
		AdapterSamsungProjector adapterSamsungProjector = new AdapterSamsungProjector(samsungProjector);

		client.initializeProjector(adapterLgProjector);
		client.initializeProjector(adapterSamsungProjector);

	}
}
