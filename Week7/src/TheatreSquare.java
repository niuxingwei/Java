import java.util.Scanner;
public class TheatreSquare {
	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in);
    int T =in.nextInt();
    while ( T -->0)
    {
    	double x = in.nextDouble();
         double y = in.nextDouble();
    	 int a = in.nextInt();
       System.out.println((long)(Math.ceil(x/a)* Math.ceil(y/a)));
    }     
		in.close();
	}
}
