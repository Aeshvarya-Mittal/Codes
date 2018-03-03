package codechef;
import java.io.*;
import java.util.*;
import java.lang.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
		    int x1=sc.nextInt();
		    int y1=sc.nextInt();
		    int z1=sc.nextInt();
		    int x2=sc.nextInt();
		    int y2=sc.nextInt();
		    int z2=sc.nextInt();
		    int x3=sc.nextInt();
		    int y3=sc.nextInt();
		    int z3=sc.nextInt();
		    int f=0;
		    boolean A=((x1>x2 && y1>=y2 && z1>=z2)||(x1>=x2 && y1>y2 && z1>=z2) ||(x1>=x2 && y1>=y2 && z1>z2));
		    boolean B=((x1>x3 && y1>=y3 && z1>=z3)||(x1>=x3 && y1>y3 && z1>=z3) ||(x1>=x3 && y1>=y3 && z1>z3));
		    
		    boolean C=((x2>x1 && y2>=y1 && z2>=z1)||(x2>=x1 && y2>y1 && z2>=z1) ||(x2>=x1 && y2>=y1 && z2>z1));
		    boolean D=((x2>x3 && y2>=y3 && z2>=z3)||(x2>=x3 && y2>y3 && z2>=z3) ||(x2>=x3 && y2>=y3 && z2>z3));
		    
		    boolean E=((x3>x2 && y3>=y2 && z3>=z2)||(x3>=x2 && y3>y2 && z3>=z2) ||(x3>=x2 && y3>=y2 && z3>z2));
		    boolean F=((x3>x1 && y3>=y1 && z3>=z1)||(x3>=x1 && y3>y1 && z3>=z1) ||(x3>=x1 && y3>=y1 && z3>z1));
		     
		    if(A&&D || B&&E || C&&B ||D&&F || E&&C || F&&A  )
		         f=1;
		      else
		         f=0;
		         
		      if(f==1)
		        System.out.println("yes");
		        else
		        System.out.println("no");   
		      
		    
		    
		    
		    
		}
		   
	}
}
