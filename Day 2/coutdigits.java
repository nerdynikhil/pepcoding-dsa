import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner take =new Scanner(System.in);
    
    int count = 0;
    int num = take.nextInt();
    do
    {
        count++;
        num /= 10;
    } while(num != 0);
    
    System.out.println(count);
}
}