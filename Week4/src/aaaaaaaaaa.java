import java.util.Scanner;

public class aaaaaaaaaa {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int count = in.nextInt();
		for(int i=0; i<count;i++)
		{
			int p1 = in.nextInt();
			int p2 = in.nextInt();
			int salary = in.nextInt();
			double  result;
			if (salary<=200 *p1)
			{
				result = salary / 200;
				System.out.format("%.4f%n",result);
			}
			else
			{
				result =(salary -  p1 * 200)/p2 + p1;
			}
			System.out.format("%.4f%n",result);
		}
in.close();
	}

}
