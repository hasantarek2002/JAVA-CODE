package assignment1;

public class Maximum extends Thread {

	private int[] arr;

	public Maximum(int[] arr) {
		this.arr = arr;

	}

	public void run() {
		int len = arr.length;
		int max = arr[0];

		for (int i = 0; i < len; i++) {
			if(max < arr[i]){
				max=arr[i];
			}
		}
		MainClass.maximum=max;
		
	}

}
