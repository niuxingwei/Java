package week_10;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Fruits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int arr[] = new int[n];
		int arr_2[] = new int[n];
		int cou = 0;
		int max = 0;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.nextLine();
		Arrays.sort(arr);
		while (m-- > 0) {
			String string = in.nextLine();
			if (map.containsKey(string)) {
				arr_2[map.get(string)] += 1;
			} else {
				arr_2[cou] = 1;
				map.put(string, cou);
				cou++;
			}
		}
		Arrays.sort(arr_2);
		for (int i = 0; i < arr_2.length; i++) {
			max += arr_2[arr_2.length - 1 - i] * arr[arr.length - 1 - i];
			min += arr_2[arr_2.length - 1 - i] * arr[i];
		}
		System.out.println(min + " " + max);
		in.close();
	}
}
