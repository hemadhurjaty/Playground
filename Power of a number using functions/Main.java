#include<stdio.h>

int power(int m,int n)
{
  int result=pow(m,n);
  return result;
}
int main(){
    // Type your code here
  int base,exponent;
  scanf("%d%d",&base,&exponent);
  int result1=power(base,exponent);
  printf("%d",result1);
  	return 0;
}