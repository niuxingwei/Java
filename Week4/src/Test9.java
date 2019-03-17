import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();	
		for (int i =0; i<amount ;i++)
		{
			int BeginIndix = in.nextInt();
			int EndIndix = in.nextInt();
	
			String str = in.nextLine();
			String str3 = str.replaceAll(" ","");
			if(BeginIndix > EndIndix)
			{
				System.out.println("-1");
			
			}
			else if(BeginIndix == EndIndix)
			{
				String str2 = str3.substring(BeginIndix  , EndIndix +1 );
			         System.out.println(str2);
			}
			else 
			{
				String str2 = str3.substring(BeginIndix - 1, EndIndix);
				System.out.println(str2);
			}					
		}
		in.close();
	}

	
}
