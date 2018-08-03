import java.util.Scanner;
public class PrimeFromAGivenRange {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int x;
		int sum=0;
		x=a.nextInt();
		int arr[]=new int[x];
		for(int i=2; i<=x; i++)
		{
			int is_prime=1;
			for(int j=2; j<=i/2; j++)
			{
				if((i%j)==0)
				{
					is_prime=0;
				}
				
				
			}
			if(is_prime ==1) 
				sum =sum+i;
				
				//System.out.print(i+" ");
		}
		//System.out.print(sum+" ");
		//for(int i=0; i<x; i++) System.out.printf("arr[i]%n"); 
		
		

	}

}
