import  java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    String str =in.next();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder rev = sb.reverse();
    String r = new String(rev);
    char arr[] = str.toCharArray();
    char arr1[] = r.toCharArray();
    int len = arr.length;
    boolean b= true;;
   for(int i =0;i<= len-1;i++){
     if(arr[i]!=arr1[i]){
      b = false;
       break;
    }
    else{
      b = true;
    }
    }
    if(b==true){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
   
  }
}