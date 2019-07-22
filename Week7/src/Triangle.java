import java.util.Arrays;
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in);
		int T = in.nextInt();
		int arr[] = new int [4]; 
		while ( T -->0)
		{
			int a = in.nextInt();
			arr[0] = a;
			int b = in.nextInt();
			arr[1] = b;
			int c = in.nextInt();
			arr[2] = c;
			int d= in.nextInt();
			arr[3] = d;
			Arrays.sort(arr);
           if( arr[0] + arr [1]> arr[2]||arr[1]+ arr[2]> arr[3])
           {
        	   System.out.println("TRIANGLE");
           }
           else if (arr[0] + arr [1]== arr[2]||arr[1]+ arr[2]== arr[3] )
           {
        	   System.out.println("SEGMENT");
           }
           else 
           {
        	   System.out.println("IMPOSSIBLE");
           }
		}
		in.close();
	}
}
