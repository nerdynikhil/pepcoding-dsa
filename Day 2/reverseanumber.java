import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        int num = take.nextInt();
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            System.out.println(digit);
        }
    }
}