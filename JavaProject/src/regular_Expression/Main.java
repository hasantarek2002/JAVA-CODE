package regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		//name=sc.nextLine();
		//name="HasAan";
		//String nameValidation="[A-Za-z]+";
//		String email="ab_c12@gmail.com";
//		String emailValidation="[a-z0-9_]+@[a-z]+.com";
//		Pattern p=Pattern.compile(emailValidation);
//		Matcher m=p.matcher(email);
		//System.out.println(m.matches()? "name is: "+name:"not found");
		
		String phone="01785222914";
		String phoneValidation="01[5-9][0-9]{8}";
		Pattern p=Pattern.compile(phoneValidation);
		Matcher m=p.matcher(phone);
		System.out.println(m.matches()? "phone is: "+phone:"not found");
		
//		String password="4asd7";
//		String passwordValidation="[A-Za-z0-9]{8,10}";
//		Pattern p=Pattern.compile(passwordValidation);
//		Matcher m=p.matcher(password);
//		System.out.println(m.matches()? "password is: "+password:"not found");
//		if(m.find()){
//			System.out.println("name is : "+name);
//		}
//		else{
//			System.out.println("not found");
//		}
	}
	
	

}
