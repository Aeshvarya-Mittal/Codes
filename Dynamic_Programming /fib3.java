package dp;

public class fib3 {
	static int fib(int n) {
		int a=0,b=1,c=0,i;
		if(n==0)
			return 0;
		for(i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}

	public static void main(String[] args) {
		int n=9;
		System.out.println(fib(n));// TODO Auto-generated method stub

	}

}
