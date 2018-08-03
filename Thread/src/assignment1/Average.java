package assignment1;

public class Average extends Thread {
	private int[] arr;

	public Average(int[] arr) {
		this.arr = arr;

	}

	public void run() {
		int len = arr.length;
		int sum = 0;

		for (int i = 0; i < len; i++) {
			sum += arr[i];
		}
		float result =  ((float)sum /(float) len);
		
		MainClass.average = result;

	}
}
