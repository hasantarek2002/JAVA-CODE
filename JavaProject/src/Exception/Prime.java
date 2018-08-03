package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeCheck primeCheck = new PrimeCheck();

		System.out.print(
				"Enter 1 to check the number is prime or not ,,press 2 for print all prime number in a given range :  ");
		boolean isMatched = true;
		do {
			Scanner scanner = new Scanner(System.in);
			try {
				int choice;
				choice = scanner.nextInt();
				if (!(choice == 1 || choice == 2))
					throw new BoundaryCheckException("Input must be 1 or 2.");
				isMatched = false;
				if (choice == 1) {
					while (true) {
						int num;
						Scanner input = new Scanner(System.in);
						try {
							System.out.print("enter the number : ");
							num = input.nextInt();
							primeCheck.checkPrime(num);
							break;

						} catch (InputMismatchException e) {
							System.out.println(e);
						} catch (MyException e) {
							System.out.println(e);

						}
					}

				} else if (choice == 2) {
					Scanner input = new Scanner(System.in);
					int min, max;
					boolean continueLoop = true;
					do {
						// problem with string input as it goes infinite loop

						try {
							System.out.print("Enter minimum value of the range : ");
							min = input.nextInt();
							System.out.print("Enter maximum value of the range : ");
							max = input.nextInt();
							primeCheck.checkPrime(min, max);
							continueLoop = false;
						} catch (InputMismatchException e) {
							System.out.println(e);
							input.nextLine();
						} catch (MyException e) {
							System.out.println(e);
						}

					} while (continueLoop);

				}

			} catch (InputMismatchException e) {
				System.out.println(e);
				scanner.nextLine();
				System.out.println(
						"Enter 1 to check the number is prime or not ,,press 2 for print all prime number in a given range :  ");
				System.out.println("Please try again.");
			} catch (BoundaryCheckException e) {
				System.out.println(e);
				System.out.println(
						"Enter 1 to check the number is prime or not ,,press 2 for print all prime number in a given range :  ");
				System.out.println("Please try again.");
			} catch (Exception e) {
				System.out.println(e);
			}
		} while (isMatched);
	}
}
