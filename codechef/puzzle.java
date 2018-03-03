package codechef;

	import java.util.*;
	 
	class puzzle
	{
	   public static void main(String [] args)
	   {
	      Scanner os=new Scanner(System.in);
	      int r=os.nextInt();
	      int i,j,temp,c,d,count=0,f=0;
	      int a[][]=new int[3][3];
	      while(r>0)
	      { 
	        r--;
	        for(i=0;i<3;i++)
	        {
	          for(j=0;j<3;j++)
	          {
	             a[i][j]=os.nextInt();
	           }
	        }
	      
	        for(i=0;i<3;i++)
	        {
	           for(j=0;j<3;j++)
	           {
	              c=a[i][j]+a[i+1][j];
	              d=a[i][j]+a[i][j+1];
	              
	               if(prime(c)==1)
	           {
	             temp=a[i][j];
	             a[i][j]=a[i+1][j];
	             a[i+1][j]=temp;
	             f=1;
	             count++;
	           }
	           
	           if(prime(d)==1)
	           {
	             temp=a[i][j];
	             a[i][j]=a[i][j+1];
	             a[i][j+1]=temp;
	             f=1;
	             count++;
	           }
	           
	           }
	           
	        }
	        if(f==0)
	      System.out.println(-1);
	      else
	      System.out.println(count);
	       }
	       
	      
	    }
	     
	     static int prime(int n)
	     {
	       int flag=0,i;
	       for(i=2;i<=n/2;i++)
	       {
	          if(n%i==0)
	          {
	            flag=1;
	            break;
	          }
	       }
	       if(flag==0)
	       return 1;
	       else
	       return 0;
	     }
	    }

