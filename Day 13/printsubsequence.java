import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take = new Scanner(System.in);
        String str = take.nextLine();
        printSS(str, "");
    }

    public static void printSS(String str, String subseq) {

        if (str.length() == 0) {
            System.out.println(subseq);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        printSS(ros, subseq + ch);
        printSS(ros, subseq + "");

    }

}