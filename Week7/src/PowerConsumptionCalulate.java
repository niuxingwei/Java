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
			int l_i =  in.nextInt();//��ʼ��
			int r_i =  in.nextInt();//�յ�
			if (flag!=0 ) //��һ�ν������
			{
				   int length = l_i - flag;
		            if ( length <= T1)//�ж�T1 ��һ���Դ�����
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
/*             ������else, ��Ϊÿ���������ֶ���Ҫˢ��   */
				sum +=(r_i - l_i)*p1;
				flag = r_i;//flag������������ ʵ��l_1 ��ǰһ��r_i �ıȽ�		
			}	
		System.out.println(sum);
		in.close();
	}
}