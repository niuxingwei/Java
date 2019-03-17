import java.util.Scanner;

public class Test4 {
     private int number;
     
	 public  Test4(int number)
		{
			this.number = number;
		}
	 public void BinaryForm()
		 {
			  String s = Integer.toBinaryString(number);
		    	System.out.println(s);	
		 }
	 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		for(int i= 0; i< amount; i++)
		{
			int number = in.nextInt();
			Test4 x = new Test4( number);
			x.BinaryForm();					
		}
		in.close();
	}

}
