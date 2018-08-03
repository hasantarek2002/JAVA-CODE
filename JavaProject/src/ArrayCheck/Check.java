package ArrayCheck;

public class Check {
	private int[][] arr;// =new int[5];
	int count = 0;

	public Check(int[][] arr) {
		this.arr = arr;
		System.out.println(arr.length);
	}

	public void print() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				int c = arr[i][j];
				count++;
				System.out.print(c + "  ");
			}
			System.out.println();
		}
		System.out.println(count);
	}

}
