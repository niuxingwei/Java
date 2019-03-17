import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	while(in.hasNextLine())
	{
		String Group_Name  = in.nextLine();
		String Comet_Name  = in.nextLine();
		int sum = 1;
		int sum2 = 1;
		int length_Group = Group_Name.length();
		int length_Comet = Comet_Name.length();
		for (int i =0 ; i <length_Group; i++)
			{
				char a[] = Group_Name.toCharArray();
			
			     sum = 0 +sum *(a[i] - 64);
			}
		for (int i =0 ; i <length_Comet; i++)
			{
				char a[] = Comet_Name.toCharArray();
			
			     sum2 = 0 +sum2 *(a[i] - 64);			
			}
		if(sum2 %47== sum%47)
			{
			System.out.format("GO%n");
			}
		else 
			{						
				System.out.format("STAY%n");
			}
	}
		in.close();

	}
}
