package week_11;

import java.util.Scanner;
public class PresentfromLena {
	public static void printline(int cou, int max) {
		for (int i = 0; i < cou; i++) {
			System.out.print("  ");
		}
		System.out.print("0");
		for (int i = 1; i <= max; i++) {
			System.out.print(" " + i);
		}
		for (int i = max - 1; i >= 0; i--) {
			System.out.print(" " + i);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i <= n; i++) {
			printline(n - i, i);
		}
		for (int i = n - 1; i >= 0; i--) {
			printline(n - i, i);
		}
		in.close();
	}
}
