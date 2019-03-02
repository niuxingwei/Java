import java.util.Scanner;
public class Test5 {
	public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int count = in.nextInt();
         for(int j=0; j<count;j++)
         {
             int number = in.nextInt();
             if (number<0)
    	         {
    	        	 number=Math.abs(number);
    	         }
             int sum =0;
            while(number>0)     {
    	        	int a = number %10;         	 
    	        	number = number/10;
    	        	sum += a;
    	        }
        	System.out.println(sum);    	 
         }
	in.close();
	}
}
