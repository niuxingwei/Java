package week_10;

import java.util.Scanner;

public class YoungPhotographer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int min = -1;
		int max = 1001;
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int min1 = Math.min(a, b);// to find min of(a,b)
			int max1 = Math.max(a, b);// to find max of(a,b)
			if (min1 > min) {
				min = min1;
			}
			if (max1 < max) {
				max = max1;
			}
		}
		if (min > max) {
			System.out.println(-1);
		} else {
			if (x < min) {
				System.out.println(min - x);
			} else if (x > max) {
				System.out.println(x - max);
			} else {
				System.out.println(0);
			}
		}
		in.close();
	}
}