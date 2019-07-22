package week_10;

import java.util.Scanner;

public class Numbers {
	public static int Gcd(int m, int n) {
		int result = 0;
		while (n != 0) {
			result = m % n;
			m = n;
			n = result;
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int sum = 0;
			int n = in.nextInt();
			for (int i = 2; i <= n - 1; i++) {
				int m = n;
				while (m > 0) {
					sum += m % i;
					m = m / i;
				}
			}
			int a = Gcd(sum, (n - 2));
			System.out.println(sum / a + "/" + (n - 2) / a);
		}
		in.close();
	}

}
