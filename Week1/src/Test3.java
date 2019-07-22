import java.util.Scanner;  
import java.math.BigInteger;  
public class Test3 {
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
  
    	Scanner in= new Scanner (System.in);  
    	String str = in.nextLine();
    	String[] array =  str.split(" ");
	    BigInteger a = new BigInteger(array[0]);  
	    BigInteger b = new BigInteger(array[1]);     
	    System.out.println(a.add(b));  
       
         
      
      
    in.close();  
      
    }  
  
}  