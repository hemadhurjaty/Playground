#include <stdio.h>
int main(){
int n,cr,cc;
  scanf("%d",&n);
  int turn=0;
  for(cr=1;cr<=n;cr++){
    for(cc=1;cc<=cr;cc++){
      if(turn==0){
        printf("*");
        turn=1;}
      else{
        printf("#");
        turn=0;}
    }
    printf("\n");}
  	return 0;
}