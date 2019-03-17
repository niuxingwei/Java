import java.util.Scanner;

public class Test1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner (System.in);
        double  x0=in.nextDouble();
        double  y0=in.nextDouble();
        double  x1=in.nextDouble();
        double  y1=in.nextDouble();
        double  x2=in.nextDouble();
        double  y2=in.nextDouble();
		double result;
		result = ( x1- x0)*(y2 - y0)-(x2 - x0)*(y1 - y0);
		if(result >0)
		{
			System.out.format("(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)%n", 
					x2, y2, x0, y0, x1, y1);
		}
		if(result ==0)
		{
			System.out.format("(%.1f, %.1f) is on the line from (%.1f, %.1f) to (%.1f, %.1f)%n", 
					x2, y2, x0, y0, x1, y1);
		}
		if(result <0)
		{
			System.out.format("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)%n", 
					x2, y2, x0, y0, x1, y1);
		}
		
in.close();
	}

}