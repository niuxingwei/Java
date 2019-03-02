import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in );
		int count = in.nextInt();
		String str = in.nextLine();
		 str = in.nextLine();
		for (int i=0;i<count;i++)
		{
			System.out.printf(str);
		}
		
		System.out.println();
		in.close();
	}

}
