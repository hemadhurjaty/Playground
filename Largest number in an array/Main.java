import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
        // Type your code here
      int size = in.nextInt();
      int arr[] = new int[size];
      for ( int i = 0;i<size;i++){
        arr[i]=in.nextInt();
      }
      int max= arr[0];
      for (int j= 0;j<size;j++){
        if(max <arr[j]){
          max=arr[j];
        }
      }
      System.out.println(max);
    }
}
