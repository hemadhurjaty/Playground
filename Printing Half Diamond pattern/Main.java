#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  for(int cr=1;cr<=n;cr++){
    for(int space=1;space<=n-cr;space++){
      printf(" ");}
    for(int cc=1;cc<=2*cr -1;cc++){
printf("*");}
    printf("\n");}
	return 0;
}