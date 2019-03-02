import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner in = new Scanner(System.in);
  
  int number= in.nextInt();
  int [] array = new int [number];
	     for(int i = 0;i < number; i++)
		     {
		    	 int a = in.nextInt();
		    	 int b = in.nextInt();
		    	 int c = a+b;
		    	array[i] = c;
		     }
	     for(int i = 0;i < number; i++)
	     {
	    	 System.out.println(array[i]);
	     }
		  
  in.close();
	}

}
