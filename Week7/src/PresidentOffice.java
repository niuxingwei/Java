import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PresidentOffice {

	public static void main(String[] args) {
          Scanner in = new Scanner( System.in);
          int m = in.nextInt();
          int n = in.nextInt();
          String []arr = new String [m];
          String color = in.next();
          Set <Integer> set = new HashSet<Integer>();
           char color_present = color.charAt(0);
          in.nextLine();
          for ( int i =0; i < m; i ++)
          {
        	    arr[i] = in.nextLine();
          }
          for (int j =0; j < arr.length; j ++)
          {
        	  for ( int k =0; k < n; k ++ )
        	  {  
        		  if ( arr[j].charAt(k)!='.'&&arr[j].charAt(k)!=color_present)
            	  {
            			 if ( k+1<n&&arr[j].charAt(k+1)==color_present)//比较右边
            			 {  
            				set.add((int) arr[j].charAt(k));      				
            			 }             			
            			 else if ( j+1<m&&arr[j+1].charAt(k)==color_present)//比较下边
            			 {  
            				set.add((int) arr[j].charAt(k));      				
            			 } 
            			 else if ( k!=0&&arr[j].charAt(k-1)==color_present)//比较左边
            			 {  
            				set.add((int) arr[j].charAt(k));      				
            			 } 
            			 else	 if ( j!=0&&arr[j-1].charAt(k)==color_present)//比较上边
            			 {  
            				set.add((int) arr[j].charAt(k));      				
            			 }           		 
        	    }          		  
        	  }
          }
          System.out.println(set.size());
          in.close();
	}
}
