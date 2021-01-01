import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = 1;

        for (int i = 0; i <= n-1; i++) { //rows
        
            int val=1;
            
            for (int j = 1; j <= nst; j++) { //stars
                System.out.print(val+"	");
                
                int nextprint = (val*(i-j+1))/j;
                val=nextprint;
            }
            nst++;
            System.out.println();
        }
    }
}