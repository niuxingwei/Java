import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		
		for (int i =0; i<amount ;i++)
		{
			int month = in.nextInt();	
			switch (month)
			{
			
			case 1 :
				System.out.format("Jan%n");
				break;
			case 2 :
				System.out.format("Jun%n");
				break;
			case 3 :
				System.out.format("Mar%n");
				break;
			case 4 :
				System.out.format("Apr%n");
				break;
			case 5 :
				System.out.format("May%n");
				break;
			case 6 :
				System.out.format("Jun%n");
				break;
			case 7 :
				System.out.format("Jul%n");
				break;
			case 8 :
				System.out.format("Aug%n");
				break;
			case 9 :
				System.out.format("Sep%n");
				break;
			case 10 :
				System.out.format("Oct%n");
				break;
			case 11 :
				System.out.format("Nov%n");
				break;
			case 12:
				System.out.format("Dec%n");
				break;
				default:
				System.out.format("Invalid%n");			
			}
		}
		in.close();
	}

}
