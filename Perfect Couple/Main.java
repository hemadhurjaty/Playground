import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code 
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = in.nextInt();
    }
    int value = in.nextInt();
    for(int j=0;j<n;j++){
      for(int k = j+1;k<n;k++){
        if(arr[j]+arr[k]==value){
          System.out.println(arr[j]+", "+arr[k]);
          
        }
        
      }
      
      
    }
    
    
    
    
    
    
    
  }
}