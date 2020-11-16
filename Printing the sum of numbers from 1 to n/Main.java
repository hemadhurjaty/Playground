#include <stdio.h>
int main() {
	int n,sum=0;
  scanf("%d",&n);
  for(int num=1; num<=n;num=num+1)
  {
    sum=sum + num;
  }
    printf("%d",sum);
  return 0;
}