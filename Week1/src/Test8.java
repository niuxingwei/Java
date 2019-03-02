import java.util.Scanner;

public class Test8 {
   
	private static Void PI(int m)
	{
		double x = 1.0;
		double count = 0.0;
		int flag = 1;
		for (int i = 1; i <= m; i = i + 2) 
		{
		flag++;
		count = count + (x / i) * (Math.pow(-1, flag));
		}
		double sum =4.0*count;
		System.out.printf(	"%.6f",sum);
		return null;
	}
	public static void main(String[] args) {    
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
	PI(n);
		in.close();
		}

}
