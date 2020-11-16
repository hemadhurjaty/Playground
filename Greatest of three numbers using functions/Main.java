#include <stdio.h>
int great(int n1,int n2);
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int big1=great(n1,n2);
  int big2=great(big1,n3);
  printf("%d",big2);
  return 0;
}
  
  
  
  
  int great(int n1,int n2)
  {
    int big;
    if(n1>n2)
    {
       big=n1;
    }
    else if(n2>n1)
    {
      big=n2;
    }
    else{
      big=n1;}
  return big;
  
}