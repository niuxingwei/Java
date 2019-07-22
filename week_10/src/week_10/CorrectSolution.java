package week_10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class CorrectSolution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		String string = in.nextLine();

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '0') {
				count++;
			}
		}
		string = string.replaceAll("0", "");
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			arr.add(string.charAt(i) - 48);
		}
		Collections.sort(arr);
		for (int i = 1; i < 1 + count; i++) {
			arr.add(i, 0);
		}
		String s1 = arr.toString();
		String s = s1.substring(1, s1.length() - 1);
		s = s.replaceAll("[',',' ']", "");
		int result_2 = in.nextInt();
		int result = Integer.parseInt(s);
		if (result_2 == result) {
			System.out.println("OK");
		} else {
			System.out.println("WRONG_ANSWER");
		}
		in.close();
	}
}
