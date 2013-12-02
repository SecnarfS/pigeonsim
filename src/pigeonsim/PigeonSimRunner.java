package pigeonsim;

public class PigeonSimRunner {

	// run for 10 seconds
	static int duration = 10;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Running PigeonSim 0.00001 for " + duration + " seconds");
		for (int i = 0; i < duration; i++) {
			if (0 == (i % 3)) {
				System.out.println("pigeon spins around...");
			} else {
				System.out.println("\"Coo, coo\"");
			}
			// wait a second
			Thread.sleep(1000);
		}
	}

}
