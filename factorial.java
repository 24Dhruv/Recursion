import java.util.*;

public class recursion {
  public static int calfact(int n){
        if (n==1){
            return 1;
        }
        int fact_nm1 = calfact(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n=6;
       System.out.println(calfact(n));
    }
    }
