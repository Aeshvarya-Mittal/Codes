package dp;

public class fibo {
	static int fib(int n) {
		int fi[ ]= new int [n+1];
		int i;
		fi[0]=0;
		fi[1]=1;
		for(i=2;i<=n;i++) {
			fi[i]=fi[i-1]+fi[i-2];
		}
		return fi[n];
	}
public static void main(String args[]) {
	int n=9;
	System.out.println(fib(n));
}
}
