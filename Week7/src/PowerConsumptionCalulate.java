import java.util.Scanner;
public class PowerConsumptionCalulate{
	public static void main(String[] args) {
		Scanner in = new Scanner( System.in);
		int n = in.nextInt();  		int p1 = in.nextInt();
		int p2 = in.nextInt(); 		int p3 = in.nextInt();
		int T1 = in.nextInt();  	int T2 = in.nextInt();
		int sum =0;		int flag =0;
		for ( int i =0; i < n; i++)
		{
			int l_i =  in.nextInt();//起始点
			int r_i =  in.nextInt();//终点
			if (flag!=0 ) //第一次进入程序
			{
				   int length = l_i - flag;
		            if ( length <= T1)//判断T1 ，一下以此类推
		            {
		            	sum += length * p1;
		            }
		            else if ( length <=T1 + T2)
		            {
		            	sum +=T1 * p1 + (length - T1)*p2;
		            }
		            else 
		            {
		            	sum +=T1*p1 + T2 * p2  + ( length - T1 - T2)*p3;
		            }
			}
/*             不能用else, 因为每次输入数字都需要刷新   */
				sum +=(r_i - l_i)*p1;
				flag = r_i;//flag具有连接作用 实现l_1 和前一个r_i 的比较		
			}	
		System.out.println(sum);
		in.close();
	}
}