import java.util.*;

public class recursion { 
  public static void  tower(int n,String src,String help,String dest){
       
        if (n==0){
            return ;
        }
        tower(n-1, src, dest, help);
        System.out.println("transfer diskee " + n + " from " + src + " to " + help);
        tower(n-1, dest, help, src);
    
    }
    public static void main(String[] args) {
        int n=3;
        tower(n, "s", "d", "h");
    }
 }
