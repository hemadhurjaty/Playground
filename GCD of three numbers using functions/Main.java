#include <stdio.h>
int gcd(int n1,int n2)
{
  int min,gcd;
  if(n1<n2)
  {
    min=n1;
  }
  else
  {
    min=n2;
  }

  while(min>=1)
  {
    if((n1%min==0)&&(n2%min==0))
    {
      gcd=min;
      break;
    }
    min--;
  }
  return gcd;
}
void main() {
	//Type your code here
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int gcd1=gcd(n1,n2);
  int gcd2=gcd(gcd1,n3);

  printf("%d",gcd1);

}
