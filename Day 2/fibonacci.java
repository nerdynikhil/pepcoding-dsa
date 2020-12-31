import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner take = new Scanner(System.in);
       int a, b, c, i, terms;
        terms = take.nextInt();

    
    a = 0;
    b = 1;
    c = 0;

    for(i=1; i<=terms; i++)
    {
        System.out.println(c);

        a = b;     // Copy n-1 to n-2
        b = c;     // Copy current to n-1
        c = a + b; // New term
    }

    }
}