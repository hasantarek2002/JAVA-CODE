package problem7;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account[]=new Account[100];
		
		InitializeAccount initializeAccount=new InitializeAccount(account);
		ChoiceMood choiceMood =new ChoiceMood (initializeAccount);
		//System.out.println(initializeAccount.toString());
		choiceMood.showExistingAccount(account);
		choiceMood.choice(account);

	}

}
