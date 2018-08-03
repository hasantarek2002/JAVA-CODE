package assignment1;

public class Minimum extends Thread{
	private int[] arr;

	public Minimum(int[] arr) {
		this.arr = arr;

	}

	public void run() {
		int len = arr.length;
		int min = arr[0];

		for (int i = 0; i < len; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		MainClass.minimum = min;
	}

}
