package codechef;
import java.util.Scanner;
class reached
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []ans=new int[n];
		for(int i=0;i<n;i++)
			ans[i]=code(in);
		for(int i=0;i<n;i++)
			if(ans[i]==1)
				System.out.println("Case "+(i+1)+": REACHED");
			else if(ans[i]==2)
				System.out.println("Case "+(i+1)+": SOMEWHERE");
			else
				System.out.println("Case "+(i+1)+": DANGER");
	}
	static int code(Scanner in)
	{	
		int m=in.nextInt();
		int n=in.nextInt();
		int rx=in.nextInt();
		int ry=in.nextInt();
		int l=in.nextInt();
		String s=in.next();
		int x=0;
		int y=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='R')
				x+=1;
			else if(s.charAt(i)=='L')
				x+=-1;
			else if(s.charAt(i)=='U')
				y+=1;
			else if(s.charAt(i)=='D')
				y-=1;
		}
		if(x==rx && y==ry)
			return 1;
		if(x>=0 && x<=m && y>=0 && y<=n)
			return 2;
		return 3;
	}
}  
