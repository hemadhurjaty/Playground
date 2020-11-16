#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int search_elem_1,search_elem_2,idx1,idx2;
  scanf("%d%d",&search_elem_1,&search_elem_2);
  for(int i=0;i<n;i++)
  {
    if((search_elem_1==arr[i]))
    {
      idx1=i;
      break;
     
    }
    else
    {
      idx1=-1;
    }
  }
  for(int i=0;i<n;i++){
    if(search_elem_2==arr[i])
    {
      idx2=i;
      break;
    }
    else
    {
      idx2=-1;
    }
  }
  
      printf("%d\n",idx1);
  printf("%d",idx2);
  
 
  return 0;
}