package banking;


import java.util.Scanner;

  class Caculate {

	private double a;
	private double b;
	private double c;
	private double x1;
	private double x2;

	
	public  Caculate(double a, double b, int c)
	{
		this.a = a;
		this.b = b;
		this .c = c;
	}
	
	public void judgMent()
	{
		double judgMent =1.0* b*b - 4.0 *a*c;
		if (judgMent>0)
		{
			x1 = (-b + Math.pow(judgMent,1.0/2.0))/(2.0*a);
            x2 = (-b  - Math.pow(judgMent,1.0/2.0))/(2.0*a);
            System.out.printf("%.6f",x1);
            System.out.printf(" ");
            System.out.printf("%.6f",x2);
            System.out.println();
      
		}
		else 	if (judgMent==0)
		{
			x1 = x2 = -b/(2*a);
            System.out.printf("%.6f", x1 );
		}
		else 
		{
			   System.out.println("The equation has no real roots" );
		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		int c = in.nextInt();
		Caculate root  = new Caculate(a, b, c);
		root.judgMent();
		in.close();
	}

}
