package dp;
import java.util.*;
public class binom {
	static int bico(int n,int k) {
		int C[]= new int[k+1];
		C[0]=1;
		for (int i=0;i<=n;i++) {
			for(int j=Math.min(i, k);j>0;j--) {
				C[j]=C[j]+C[j-1];
			}
		}
	return C[k];
	}
	

	public static void main(String[] args) {
		int n=5;
		int k=2;
		System.out.printf("Value of C(%d,%d) is %d",n,k,bico(n,k));
		// TODO Auto-generated method stub

	}

}
