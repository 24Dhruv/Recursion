import java.util.*;

public class recursion {
     public static int first = -1;
        public static int last = -1;
        
        public static void occurance(String str,int idx ,char ele){

            if( idx == str.length()){
                System.out.println(first);
                System.out.println(last);
                return;
            }
            char currchar = str.charAt(idx);
            if( currchar == ele){
                if( first == -1){
                    first =idx;
                }else{
                    last=idx;
                }
            }
            occurance(str, idx+1, ele);
        }
        public static void main(String[] args) {
            String str = "abchsbavbkkabk";
            occurance(str, 0, 'b');
        }
    }
