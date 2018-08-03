import java.util.Scanner;
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num2,res;
		Scanner s=new Scanner (System.in);
		//num=s.nextInt();
		/*
		if(num<0){
			throw new Exception("must be Positive");
		}
		System.out.println(num);
		System.out.println("kjfhash");
		*/
		/*
		try{
			num=s.nextInt();
			System.out.println(num);
		}catch(Exception e){
			System.out.println(e);
		}
		*/
		try{
			num=s.nextInt();
			num2=s.nextInt();
			res=num/num2;
			System.out.println(res);
		}catch(ArithmeticException e){
			System.out.println(e);
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("Hasan");
	}

}
