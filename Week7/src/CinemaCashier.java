import java.util.Scanner;
public class CinemaCashier{
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int T = in.nextInt();
   int M = in.nextInt();
   int row = 0;
   int col =0;
   int min = -2;
   int center =M/2;
   int Hall[][] = new int [M][M];
   for ( int i = 0; i < T; i++)
   {	  
	   int number_i = in.nextInt();
	   if ( number_i > M)
	   {
		   System.out.println("-1");
	   }		  
		  else
		  {
		      int sum =0;
			  for ( int j=0; j < M; j ++)
			 {
				 for ( int k=0; k < M-number_i+1; k++)
				 {
					 int count =0;
					 sum =0;
					 for ( int m =0; m < number_i; m ++)
					 {
						 if (Hall[j][k+m]==0 )
						 {
							 count ++;
							 sum +=Math.abs(j-center) + Math.abs(k+m-center);
						 }
					 }
					 if (count ==number_i)
					{
						if ( min==-2||sum<min)
						{
							min = sum;
							row = j;
							col =k;
						}
					}						  
				}	
				 
				 
				 
				 
			 }
			  if (min!=-2)
				{
					for ( int q = 0; q<number_i; q++)
					{
						Hall[row][col+q]=1;
					}
				}		  
		}
	   if(min==-2)
	   {
	     System.out.println("-1");
	   }
	   else
	   {
		 System.out.println(  (1+row) +" "+ (col+1) +" "+ (col+number_i) );
		 min =-2;
	   }		 
	   }  
   in.close();
	}
}