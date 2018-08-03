package assignment3;

public class RandomPoints extends Thread {

	private int totalCounts = 0;
	private int numberOfSuccess = 0;

	public void run() {

		double x, y;

		for (int i = 0; i < 1000000; i++) {
			x = Math.random();
			y = Math.random();

			totalCounts++;

			if (x * x + y * y <= 1)
				numberOfSuccess++;
		}

		MainClass.totalNumberofPoints = totalCounts;
		MainClass.numberofPointInCircle = numberOfSuccess;
	}

}
