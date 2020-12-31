import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner take = new Scanner(System.in);
    int num = take.nextInt();
    
    for (int div=2;div*div<=num;div++)
    {
        while (num%div==0){
            num= num/div;
            System.out.print(div+" ");
        }
    }
    if (num!=1)
        System.out.print(num);
    }
}