import java.util.Scanner;
public class Test7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count=in.nextInt();
		for(int j=0;j<count;j++) {
		int begin = in.nextInt();
		int end = in.nextInt();
		if(begin>end)		System.out.println();	
		  for (int i = begin; i <=end;i++) {  System.out.print(i);  
          if (i % 3 == 0) {  
              System.out.print(" foo");  
          }  
          if (i % 5 == 0) {  
              System.out.print(" bar");  
          }  
          if (i % 7 == 0) {  
              System.out.print(" baz");  
          }  
          System.out.print("\n");
		  }
	}		
		in.close();
	}
}




 
