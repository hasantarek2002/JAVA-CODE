package problem7;

import java.util.Scanner;

public class ChoiceMood {
	InitializeAccount initializeAccount = new InitializeAccount();

	public ChoiceMood(InitializeAccount initializeAccount) {
		this.initializeAccount = initializeAccount;
	}

	// Account[] account=new Account[100];

	public void showExistingAccount(Account[] account) {
		// this.account = account;
		for (int i = 0; i < 5; i++) {
			System.out.println(account[i].toString());
		}
	}

	public void choice(Account[] account) {
		Scanner input = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("Enter 1 for create account,  2 for debit , 3 for credit,   0 for exit : ");
			choice = input.nextInt();
			if (choice == 0)
				break;
			else if (choice == 1) {
				initializeAccount.creatAccount();
			} else if (choice == 2) {
				String id, temp;
				int balance;
				int count = 0;
				boolean found = false;
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter account ID : ");
				id = scanner.nextLine();
				System.out.print("Enter amount : ");
				balance = scanner.nextInt();
				// temp = scanner.nextLine();
				for (int i = 0; i < account.length; i++) {
					count = i;
					if ((account[i].getId()).equals(id)) {
						account[i].debit(balance);
						found = true;
						break;
					}
				}
				if (found == false)
					System.out.println("Account Id does not match.");
				else {
					System.out.println(account[count].toString());
					// showExistingAccount(account);
				}

			} else if (choice == 3) {
				String id, temp;
				int balance;
				int count = 0;
				boolean found = false;
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter account ID : ");
				id = scanner.nextLine();
				System.out.print("Enter amount : ");
				balance = scanner.nextInt();
				// temp = scanner.nextLine();
				for (int i = 0; i < account.length; i++) {
					count = i;
					if ((account[i].getId()).equals(id)) {
						account[i].credit(balance);
						found = true;
						break;
					}
				}
				if (found == false)
					System.out.println("Account Id does not match.");
				else {
					System.out.println(account[count].toString());
				}

			} else if (choice == 4) {
				String sourceID, destinationID, temp;
				int balance;
				boolean source = false;
				boolean destination = false;
				int countForSource = 0, countForDestination = 0;
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter  source account ID : ");
				sourceID = scanner.nextLine();
				System.out.print("Enter destination account ID : ");
				destinationID = scanner.nextLine();
				System.out.print("Enter amount : ");
				balance = scanner.nextInt();
				// temp = scanner.nextLine();
				for (int i = 0; i < account.length; i++) {

					if ((account[i].getId()).equals(sourceID)) {
						countForSource = i;
						// System.out.println("dddd");

						source = true;
						int amount = account[i].getBalance() - balance;
						account[i].setBalance(amount);
						System.out.println("Source account information :");
						System.out.println(account[i].toString());
					}

				}
				for (int i = 0; i < account.length; i++) {
					if ((account[i].getId()).equals(destinationID)) {
						countForDestination = i;
						destination = true;

						int amount = account[i].getBalance() + balance;
						account[i].setBalance(amount);
						System.out.println("Destination account information :");
						System.out.println(account[i].toString());
					}
				}
			}

		}

	}

}
