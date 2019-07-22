package week_11;

import java.util.Scanner;
public class JumpingJack {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) 
		{
			int n = in.nextInt();
			int sum = 0;
			int step = 0;
			if (n == 0) 
			{
				System.out.println(0);
				continue;
			}
			if (n < 0) 
			{
				n = -n;
			}		
			for (int i = 0;; i++) 
			{
				sum += i;
				if (sum == n) 
				{
					step = i;
					break;
				} else if (sum > n && (sum - n) % 2 == 0) 
				{
					step = i;
					break;
				}
			}
			System.out.println(step);
		}
		in.close();
	}
}
