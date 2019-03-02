import java.util.Scanner;
public class Test7 {
	public static void main(String[] args) 	{
		Scanner in = new Scanner(System.in );
		int a = in.nextInt();
		for(int j=0;j<a;j++) {
			int b = in.nextInt();
			String str = in.nextLine();
			str=str.substring(1);
			
			for(int i=0;i<b;i++) {
				
				System.out.print(str);
			}
			System.out.println();
		}
		in.close();
	}

}
