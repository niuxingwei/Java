import java.util.Scanner;
public class Test4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count =in.nextInt();
		in.nextLine();
		for(int j=0;j<count;j++)	{		
			String  str = in.nextLine();
		str = str.replace('-',' ');
		str= str.trim();
			StringBuffer Str = new StringBuffer();
			for(int i=0;i <str.length(); i++)	{
				char newstr= str.charAt(i);
				int beginPosition = str.indexOf(newstr);
				int endPosition = str.lastIndexOf(newstr);
				if (beginPosition==endPosition||beginPosition == i)	{
					Str.append(newstr);
				}
			}
			System.out.println(Str);
		}
	
		in.close();		
	}
}
