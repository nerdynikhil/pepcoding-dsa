import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take = new Scanner(System.in);
        int n = take.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = take.nextInt();
        }
        int x = take.nextInt();
        int ans = lastIndex(arr, 0, x);  //watch closely the idx passed
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x) {
    
       if(idx == arr.length){
           return -1;
       } 
       
       int tempans = lastIndex(arr, idx+1, x);
       if (tempans != -1){
           return tempans;
       }
       if (arr[idx]==x){
           return idx;
       }
       
       return -1;

    }

}