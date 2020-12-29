import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        int a, b, c;
        a = take.nextInt();
        b = take.nextInt();
        c = take.nextInt();
        boolean res = a > b ? (a > c ? a * a == b * b + c * c : c * c == a * a + b * b) : (b > c ? b * b == a * a + b * b : c * c == a * a + b * b);

        if (res) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}