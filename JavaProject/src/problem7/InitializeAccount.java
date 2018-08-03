package problem7;

import java.util.Arrays;
import java.util.Scanner;

public class InitializeAccount {
	// public String NULL = null;
	Account account[] = new Account[100];
	int accountIndex = 5;
	// Account account[];

	public InitializeAccount() {

	}

	public InitializeAccount(Account[] account) {

		this.account = account;
		for (int i = 0; i < account.length; i++) {
			account[i] = new Account(null, null, 0);
			// account[i]=null;
		}

		/*
		 * for (int i = 0; i < 5; i++) { int balance; String id, name,temp;
		 * Scanner input = new Scanner(System.in);
		 * System.out.print("Enter account Id number : "); id =
		 * input.nextLine(); System.out.print("Enter account name : "); name =
		 * input.nextLine(); System.out.print("Enter balance : "); balance =
		 * input.nextInt(); temp=input.nextLine(); account[i] = new Account(id,
		 * name, balance); }
		 */
		account[0] = new Account("111", "Hasan", 10000);
		account[1] = new Account("222", "Rahim", 20000);
		account[2] = new Account("333", "Sabbir", 30000);
		account[3] = new Account("444", "Karim", 40000);
		account[4] = new Account("555", "Shaju", 50000);
	}

	public void creatAccount() {
		String id, name, temp;
		int balance;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter account ID : ");
		id = scanner.nextLine();
		System.out.print("Enter account name : ");
		name = scanner.nextLine();
		System.out.print("Enter account balance : ");
		balance = scanner.nextInt();
		// temp = scanner.nextLine();
		account[accountIndex] = new Account(id, name, balance);
		System.out.println(account[accountIndex].toString());
		accountIndex = accountIndex + 1;
	}

	@Override
	public String toString() {
		return "InitializeAccount [account=" + Arrays.toString(account) + "]";
	}

}
