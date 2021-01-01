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

        int d = take.nextInt();
        
        int flag=0;
        for (int i = 0; i < n; i++) {
            if (d == arr[i]){
                System.out.println(i);
                flag=1;
                break;
            }
                
                
        }
        if(flag==0)
        System.out.println(-1);



    }

}