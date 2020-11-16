import java.util.Scanner;
class Main{
    public static void main(String args[]){
      
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      
      int arr[] = new int[size];
      for (int i =0;i<size ;i++){
        arr[i] =in.nextInt();
      }
      int e1=in.nextInt();
      int e2 = in.nextInt();
      int idx1 = -1;
      int idx =-1;
      for(int j = 0;j<size;j++){
        if(e1 ==arr[j]){
          idx1 = j;
        } if (e2 == arr[j]){
          idx=j;
        }
      }
      System.out.println(idx1);
      System.out.println(idx);
    }
}