package dp;

public class lcs1 {
	int a(char X[],char Y[],int m,int n) {
		int L[][]=new int[m+1][n+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0)
					L[i][j]= 0;
				else if(X[i-1]==Y[j-1])
					L[i][j]=1+L[i-1][j-1];
				else
					L[i][j]=max(L[i][j-1],L[i-1][j]);
				
			}
		}
		return L[m][n];
	}
	
	int max(int a,int b) {
		return (a>b)?a:b;
	}

	public static void main(String[] args) {
		lcs a=new lcs();
		String s1="AAGGTAB";
		String s2="GXTXAB";
		char[] X=s1.toCharArray();
		char[] Y=s2.toCharArray();
		int m=X.length;
		int n=Y.length;
		System.out.println("Length of Lcs is "+ a.a(X,Y,m,n));
// TODO Auto-generated method stub

	}

}
