import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for (int i =0;i<n;i++){
      arr[i] = in.nextInt();
    }
    System.out.println(maxfun(arr,n));
  }
    public static int maxfun(int[] arr,int n){
      int max = arr[0];
      int idx =-1;
      for(int i=0;i<n;i++){
        if(max<arr[i]){
          max = arr[i];
          idx =i;
        }

      }
        return idx;
    }   
        
    
    
  
}