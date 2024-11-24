package dynamic_programming.basic;

public class Fibonacci2 {
	public static int getFibo(int num) {
		if (num <= 1) {
			return num;
		}
		int n[] = new int[num + 1];
		n[0] = 0;
		n[1] = 1;
		for (int i = 2; i <= num; i++) {
			n[i] = n[i - 1] + n[i - 2];
		}
		return n[num];
	}

	public static void main(String[] args) {
		System.out.println(getFibo(50));
	}
}
