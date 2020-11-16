#include <stdio.h>
int main() {
	//Type your code
  int n,remain,sum=0,digits,temp;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    digits++;
    temp=temp/10;
  }
  temp =n;
  while(temp != 0)
  {
    remain=temp%10;
    sum=sum+pow(remain,digits);
    temp=temp/10;
  }
  if(sum==n)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}