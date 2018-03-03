package codechef;
import java.util.*;
class count
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int A=t;
        int result[]=new int[t];
        int a=0;
        while(t>0)
        {
            int num=0;
            int l=in.nextInt();
            int k=in.nextInt();
            for(int i=1;i<=l-k+1;i++)
                 num+=i;
            result[a]=num;
            a++;
            t--;
        }
        for(int i=1;i<=A;i++)
         System.out.println("Case "+i+": "+result[i-1]);
    }
} 

