import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take= new Scanner(System.in);
        int n = take.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= take.nextInt();
        }
        int x = take.nextInt();
        int ans = firstIndex(arr, 0, x);
        System.out.println(ans);
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        //recursive approach
        if(idx == arr.length)
        return -1;
        
        if (arr[idx]==x){
            return idx;
        }
        
        int tempans=  firstIndex(arr, idx+1,x);
        return tempans;
    }

}