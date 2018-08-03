package assignment1;

import java.util.Scanner;

public class MainClass {
	public static float average = 0; 
	public static int maximum = 0;
	public static int minimum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of input array : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i< num; i++){
			arr[i]=sc.nextInt();
		}

		Average avg = new Average(arr);
		Maximum max = new Maximum(arr);
		Minimum min = new Minimum(arr);

		avg.start();
		max.start();
		min.start();

		try {
			avg.join();
			max.join();
			min.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("The Average value is " + average);
		System.out.println("The Maximum value is " + maximum);
		System.out.println("The Mimimum value is " + minimum);

	}

}
