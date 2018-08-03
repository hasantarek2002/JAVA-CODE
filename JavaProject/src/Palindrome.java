
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp,rem,sum=0;
		num=13;
		temp=num;
		while(num!=0){
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		if(sum==temp)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}
