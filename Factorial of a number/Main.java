#include <stdio.h>
int main() {
	//Type your code
  int n ,fact=1;
  scanf("%d",&n);
  if(n==0)
  {
    printf("1 ");
  }
  for(int i=n;i>=1;i--)
  {
    fact=fact*i;
  }
  printf("%d",fact);
	return 0;
}