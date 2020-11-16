import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = in.nextInt();
      }
      int size =0;
      int[] arr1 = new int[n];
      for(int i=0;i<n;i++){
        if(arr[i]!=0){
          arr1[size]=arr[i];
          size++;
        }
      }
      for(int j = size+1;j<n;j++){
        arr1[j]=0;
      }
      for(int k =0;k<n;k++){
        System.out.print(arr1[k]+" ");
      }
    }
}