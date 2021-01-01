import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner take = new Scanner(System.in);
    int n = take.nextInt();
    
    int[]arr = new int[n];
    for (int i=0;i<n;i++){
        arr[i]= take.nextInt();
    }
    
    int min=arr[0];
    int max=arr[0];
    
    for (int i=0;i<n;i++){
        if (arr[i]>max)
        max=arr[i];
        if (min>arr[i])
        min=arr[i];
    }
    System.out.println(max-min);
    
    }

}