import java.math.BigInteger;    
import java.util.Scanner;    
    
public class Test1 {    
    
    public static void main(String[] args) {    
       Scanner in = new Scanner(System.in);      
       while(in.hasNextLine())  
       {  
             
           String str = in.nextLine();    
           String array [] = str.split(" ");   
           BigInteger a = new BigInteger(array[0]);      
           BigInteger b = new BigInteger(array[1]);     
           int a1 = a.intValue();  
           int b1 = b.intValue();  
           int c = a1 + b1;  
           if(a1==0&&b1==0) {  
               break;    
           }  
           else {   
               System.out.println(c);      
           }     
       }  
       in.close();    
    }    
}