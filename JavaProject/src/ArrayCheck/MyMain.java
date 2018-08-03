package ArrayCheck;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][3];

		/*
		 * for(int i=0; i<5; i++){ arr[i]=i+1; }
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++)
			{
				arr[i][j] = 5;
				
			}
				
			// count++;
			// System.out.println(c);
		}
		Check check = new Check(arr);
		check.print();
	}

}
