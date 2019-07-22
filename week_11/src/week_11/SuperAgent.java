package week_11;
import java.util.Scanner;
public class SuperAgent {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char arr[][] = new char[3][3];
		int flag = 0;
		for (int i = 0; i < 3; i++) {
			String c = in.nextLine();
			for (int j = 0; j < 3; j++) {
				arr[i][j] = c.charAt(j);
			}
		}
		for (int i = 0; i < 3; i++) {
			if ((arr[0][i] == arr[2][2 - i]) && arr[1][0] == arr[1][2]) {
				flag = 1;
			} else {
				flag = 0;
			}
		}
		if (flag == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}
}
