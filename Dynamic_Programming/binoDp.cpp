#include<iostream>
#include<stdio.h>
int min(int a,int b);
int binoco(int n,int k){
  int a[n+1][k+1];
  for( int i=0;i<=n;i++){
    for(int j=0;i<=min(i,k);j++){
      if(j==i || j==0)
      a[i][j]=1;
      else
      a[i][j]=a[i-1][j-1]+a[i-1][j];
    }
}
return a[n][k];
}
int min(int a,int b){
  return (a<b)?a:b;
}
int main(){
  int n=10;
  int k=5;
  printf("%d",binoco(n,k));
  return 0;
}
