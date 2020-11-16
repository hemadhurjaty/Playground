#include <stdio.h>
int main() {
	int n,fd,temp,ld,sum;
  scanf("%d",&n);
  temp=n;
  ld= n% 10;
  while(n>=100)
  {
    n/=10;
  }
      fd=n/10;
    sum= fd + ld;
    printf("%d",sum);
	return 0;
}