import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		in.nextLine();
		for (int i =0; i<amount ;i++)
		{
			String str = in.nextLine();
			int number = Integer.parseInt(str);
			String str2 = String.valueOf(number);
			int length = str2.length();
		if (number < 0)
			{
				length = length -1;
			}
		int result=0;
		int count =  length;
			for (int j =0; j< length; j++)
				{				
					int a=number%10;					
					result = (int) (result + a * Math.pow(10, count -1)); 
					count --;
					number = number /10;					
				}
				System.out.println(result);
		}
		
in.close();
	}

}
