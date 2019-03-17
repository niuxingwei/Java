
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		for(int i= 1; i<=amount; i++)
		{
			long x =in.nextInt();
			long y = in.nextInt();	
			long sum = 0;		
			if(x==y)
			{
				System.out.format("Case %d: %d%n", i ,x);
			}			
			if (x<y)
			{
				sum += ((x + y)*(y-x +1))/2;
				System.out.format("Case %d: %d%n",i,sum);
			}
		   if (x > y)
			{
				System.out.format("Case %d: %n",i);
			}					
		}
		in.close();
	}
}
