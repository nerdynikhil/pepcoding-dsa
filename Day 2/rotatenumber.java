import java.util.*;
import java.lang.Math; 

public class Main {

    public static void main(String[] args) {
    Scanner take = new Scanner(System.in);
    int n= take.nextInt();
    int k= take.nextInt();
    
    int nod=0;
    int num=n;
    while(num!=0){
        num/=10;
        nod++;
    }
    k= k%nod;
    if (k<0){
        k+=nod;
    }
    
    int div= (int) Math.pow(10,k);
    int mult= (int) Math.pow(10,nod-k);
    
    int q=n/div;
    int r=n%div;
    
    int ans = (r*mult)+q;
    System.out.println(ans);
    
    }
}