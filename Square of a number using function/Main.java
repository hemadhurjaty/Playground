#include<stdio.h>
int square_of_number(int num);
int main() {
  int n;
  scanf("%d",&n);
  printf("%d",square_of_number(n));
  
   // Type your code here
   return 0;
}
int square_of_number(int num){
  int result=num*num;
  return result;
}