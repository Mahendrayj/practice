package com.kn.primenumber;

public class PrimeNumber {
	// within method adding parameter as a int num to find out with return type
	public boolean isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;

			}

		}
		if (count == 2) {
			return true;
		} else
			return false;
	}
}
