package week_11;

import java.util.Scanner;

public class StringTask{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.toLowerCase();
		str = str.replaceAll("a", "");
		str = str.replaceAll("e", "");
		str = str.replaceAll("i", "");
		str = str.replaceAll("o", "");
		str = str.replaceAll("u", "");
		str = str.replaceAll("y", "");
		StringBuffer STR = new StringBuffer(str);
		for (int i = 0; i < STR.length(); i++) {
			if (i % 2 == 0) {
				STR = STR.insert(i, '.');
			}
		}
		System.out.println(STR);
		in.close();
	}
}