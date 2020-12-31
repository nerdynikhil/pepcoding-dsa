import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner take = new Scanner(System.in);
    int n1= take.nextInt();
    int n2= take.nextInt();
    
    int divisor= n1;;
    int dividend= n2;
    
    while(dividend%divisor!=0){
        int rem= dividend % divisor;
        
        dividend = divisor;
        divisor = rem;
    }
    
    int gcd= divisor;
    
    int lcm=(n1*n2)/gcd;
    System.out.println(gcd);
    System.out.println(lcm);
    }
}