package week_11;

import java.util.Scanner;

public class IncreasingSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int d = in.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int number = in.nextInt();
			arr[i] = number;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= arr[i - 1]) {
				while (arr[i] <= arr[i - 1]) {
					arr[i] += d;
					count++;
					if(arr[i]>arr[i-1])
					{
						break;
					}
				}
			} else {
				continue;
			}
		}
		System.out.println(count);

		in.close();
	}

}
