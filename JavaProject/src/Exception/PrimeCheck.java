package Exception;

import java.io.IOException;
import java.util.InputMismatchException;

public class PrimeCheck {
	public void checkPrime(int n) throws MyException {
		boolean isPrime = true;
		if (n < 0)
			throw new MyException("Number must be positive");
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println("Number is prime.");
		} else
			System.out.println("Number is not prime.");
	}

	public void checkPrime(int min, int max) throws MyException  {

		if (min < 0)
			throw new MyException("first Number must be positive");
		if (max < 0)
			throw new MyException("Second Number must be positive");
		if (min >= max)
			throw new MyException("first Number must be less than second number.");
		for (int i = min; i <= max; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
				System.out.println(i);
		}
	}

}
