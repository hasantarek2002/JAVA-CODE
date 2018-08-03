import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int x;
		x=a.nextInt();
		int is_prime=1;
		for(int i=2; i<=x/2; i++)
		{
			if((x%i)==0)
				is_prime=0; 
			
		}
		if(is_prime==1)  System.out.printf("prime%n");
		else   System.out.printf("Not prime%n");
		

	}

}
