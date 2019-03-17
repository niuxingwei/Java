import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		for(int i= 0; i< amount; i++)
		{
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double result = Math.pow( Math.pow((x2 - x1) , 2.0) + 
			             	Math.pow((y2 - y1) , 2.0), 0.5); 		
			System.out.format("%.4f%n",result);			
		}
		in.close();
	}

}



