package Inheritance;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("1111","Hasan",234567);
		//System.out.println(employee.toString());
		//BankEmployee bankEmployee=new BankEmployee("22","Tarek",1000000,"222-222-222");
		BankEmployee bankEmployee=new BankEmployee();
		bankEmployee.setSocialSecuirityNumber("111-222-333");
		//bankEmployee.running();
		System.out.println(bankEmployee.toString());

	}

}
