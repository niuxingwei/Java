import java.util.Scanner;
public class Test6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count =in.nextInt();
		in.nextLine();
		for(int j=0;j<count;j++)	{
			String str = in.nextLine();
			System.out.println(str.length());
		}
		in.close();
	}
}
