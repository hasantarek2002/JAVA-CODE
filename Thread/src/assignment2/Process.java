package assignment2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Process {
	
	public static int inputNumber=0;
	public static List<Integer> outputArray=new ArrayList<Integer>();
	
	
	public void processPrime() {
			
		System.out.println("Enter a number");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		inputNumber=num;

		int numberOfThreads = (int) Math.sqrt((double) num);

		int[][] arr = new int[numberOfThreads][num / numberOfThreads + 1];
		int cnt = 1;
		for (int i = 0; i < numberOfThreads; i++) {
			for (int j = 0; j < num / numberOfThreads + 1; j++) {
				arr[i][j] = cnt++;
			}
		}

		
		Prime[] prime = new Prime[numberOfThreads];
		
		for (int i = 0; i < numberOfThreads; i++) {
			prime[i] = new Prime(arr[i]);
			prime[i].start();
		}

		try {
			for (int i = 0; i < numberOfThreads; i++)
				prime[i].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort(outputArray);
		System.out.println(outputArray);
		
	}

}
