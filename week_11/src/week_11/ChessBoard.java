package week_11;

import java.util.Scanner;

public class ChessBoard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		char arr[][] = new char[8][8];
		int x = 0;
		int y = 0;
		for (int i = 0; i < 8; i++) {
			String c = in.nextLine();
			for (int j = 0; j < 8; j++) {
				arr[i][j] = c.charAt(j);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 'B') {
					count++;
				}
				if (count == 8) {
					x++;
				} else {
					y = count;
				}
			}
		}
		if (x == 8 && y == 7) {
			System.out.println(x);
		} else {
			System.out.println(x + y);
		}
		in.close();
	}
}
