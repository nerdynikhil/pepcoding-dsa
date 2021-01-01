import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int noe = 1; //number of elements

        int count = 1;

        for (int i = 1; i <= n; i++) { //rows
            for (int j = 1; j <= noe; j++) { //stars
                System.out.print(count + "	");
                count++;
            }
            noe++;
            System.out.println();
        }
    }
}