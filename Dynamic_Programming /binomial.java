package dp;
import java.util.*;
public class binomial {
	static int bico(int n,int k) {
		if(k==0 || k==n)
			return 1;
		
		return bico(n-1,k-1)+ bico(n-1,k);
	}

	public static void main(String[] args) {
		int n=5;
		int k=2;
		System.out.printf("Value of C(%d,%d) is %d",n,k,bico(n,k));// TODO Auto-generated method stub

	}

}
