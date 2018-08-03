package Inheritance;

public class BankEmployee extends Employee {
	
	public BankEmployee() {
	}

	public BankEmployee(String id, String name, int salary, String socialSecuirityNumber) {
		super(id, name, salary);
		this.socialSecuirityNumber = socialSecuirityNumber;
	}

	public BankEmployee(String id, String name, int salary) {
		super(id, name, salary);
	}

	private String socialSecuirityNumber;

	

	@Override
	public String toString() {
		return "BankEmployee [socialSecuirityNumber=" + getSocialSecuirityNumber() + "Employee Information = "
				+ super.toString() + "]";
	}

	public String getSocialSecuirityNumber() {
		return socialSecuirityNumber;
	}

	public void setSocialSecuirityNumber(String socialSecuirityNumber) {
		this.socialSecuirityNumber = socialSecuirityNumber;
	}

}
