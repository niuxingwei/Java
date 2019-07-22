package week_10;

import java.util.Scanner;

public class BobLetter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int min_i = n;
		int max_i = 0;
		int max_j = 0;
		int min_j = m;
		in.nextLine();
		String Letter[] = new String[n];
		for (int i = 0; i < n; i++) {
			Letter[i] = in.nextLine();
			for (int j = 0; j < m; j++) {
				if (Letter[i].charAt(j) == '*') {
					if (j > max_j) {// to find the max col
						max_j = j;
					}
					if (j < min_j) {// to find the min col
						min_j = j;
					}
					if (i > max_i) {// to find the max row
						max_i = i;
					}
					if (i < min_i) {// to find the min row
						min_i = i;
					}
				}
			}			
		}
		for (int j = min_i; j <= max_i; j++) {
			System.out.println(Letter[j].substring(min_j, max_j+1));
		}
		in.close();
	}

}
