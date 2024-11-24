package dynamic_programming.basic;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	private static Map<Integer, BigInteger> memo = new HashMap<>();

	public static void main(String[] args) {
		int n = 100; // Input value (example with a larger Fibonacci number)
		System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
	}

	public static BigInteger fibonacci(int n) {
		if (memo.containsKey(n)) {
			return memo.get(n);
		}
		BigInteger result;
		if (n <= 1) {
			result = BigInteger.valueOf(n);
		} else {
			result = fibonacci(n - 1).add(fibonacci(n - 2));
		}
		memo.put(n, result);
		return result;
	}
}
