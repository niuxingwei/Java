import java.util.*;
public class AplusBIV
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int p1=in.nextInt();
        int p2=in.nextInt();
        int p3=in.nextInt();
        int t1=in.nextInt();
        int t2=in.nextInt();
        int consume=0;
        int time=0;
        for(int i=0;i<n;i++)
        {
            int start=in.nextInt();
            int finish=in.nextInt();
            if(time!=0)
            {
                int t=start-time;
                if(t<=t1)
                {
                    consume+=t*p1;
                }
                else if(t<=t1+t2)
                {
                    consume+=t1*p1+(t-t1)*p2;
                }
                else
                {
                    consume+=t1*p1+t2*p2+(t-t1-t2)*p3;
                }
            }
            consume+=(finish-start)*p1;
            time=finish;
        }
        System.out.println(consume);
        in.close();
    }  
}