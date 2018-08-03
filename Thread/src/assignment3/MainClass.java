package assignment3;

public class MainClass {

	public static int totalNumberofPoints = 0;
	public static int numberofPointInCircle = 0;

	public static void main(String[] args) {

		RandomPoints ran = new RandomPoints();
		ran.start();

		try {
			ran.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(totalNumberofPoints + "   " + numberofPointInCircle);

		System.out.println("Pi = " + 4 * (double) numberofPointInCircle / (double) totalNumberofPoints);
	}

}
