import java.util.*;

public class array{
  public static void revdisplay (int arr[],int idx){
    if(idx == 0){
        System.out.println(arr[idx]);
        return;
    }
   
    System.out.println(arr[idx]);
    revdisplay(arr,idx-1); 
 
}
  public static void main(String args[]){
    int []arr = {1,2,3,4,5,6,8,1};
        revdisplay(arr, arr.length-1);
  }
}
