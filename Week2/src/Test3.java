import java.util.Scanner;
public class Test3 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int count = in.nextInt();
		for(int i=0; i<count;i++)
		{
			int number = in.nextInt();
			if(number<0)
			{
				number = Math.abs(number);
			}
			String str = Integer.toString(number);
			int Length= str.length();
			System.out.println(Length);
		}
		in.close();
	}
}
