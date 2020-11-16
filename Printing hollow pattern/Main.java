#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int cr=1;cr<=n;cr++){
    for(int cc=1;cc<=n;cc++){
      if((cr==1)||(cr==n)||(cc==1)||(cc==n)){
        printf("*");}
      else
        printf(" ");}
    printf("\n");}
	return 0;
}