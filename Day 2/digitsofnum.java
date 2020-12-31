import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner take = new Scanner(System.in);
        int n = take.nextInt();

        int ndash = n;
        int pow=1;
        while(ndash>9){
            ndash=ndash/10;
            pow=pow*10;
        }
        
        while(pow>0){
            int firstVal=n/pow;
            System.out.println(firstVal);
            
            n=n%pow;
            pow= pow/10;
        }


    }
}