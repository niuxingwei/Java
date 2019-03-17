import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		for(int i= 0; i< amount; i++)
		{
			double F = in.nextDouble();
			double C = 5*(F - 32)/9;		
			System.out.format("%.2f%n",C);			
		}
		in.close();
	}
}
