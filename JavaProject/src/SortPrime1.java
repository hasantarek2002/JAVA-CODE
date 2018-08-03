import java.util.Scanner;

public class SortPrime1 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int x;
		int sum=0;
		int count=0;
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
			{
				arr[count]=i;
				count++;
				
				
			}
				
				
				//System.out.print(i+" ");
		}
		for(int i=0; i<count; i++)
		{
			sum=sum+arr[i];
		}
		System.out.print(sum+" ");
			
			//System.out.print(arr[i]+" "); 
	}

}
