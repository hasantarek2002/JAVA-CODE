package assignment2;

import java.util.Scanner;

public class Prime extends Thread{
	public int [] value;
	
	public Prime(int [] a){
		value = a;
	}

	public void run(){
		
		for(int j:value){
			boolean flag = false;
			for(int i=2; i<j; i++)
			{
				if(j%i==0){
					flag = true;
					break;
				}
				else continue;
			}
			if(flag==false && j!=0 && j <= Process.inputNumber){
				//System.out.println(j);
				Process.outputArray.add(j);
			}
		}	
	}
	
}
