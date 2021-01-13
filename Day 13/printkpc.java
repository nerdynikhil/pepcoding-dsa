import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner take = new Scanner(System.in);
        String st = take.nextLine();
        printKPC(st, "");
    }

    static String[] keypad = {
        ".;",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwx",
        "yz"
    };

    public static void printKPC(String str, String subseq) {
        if (str.length() == 0) {
            System.out.println(subseq);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        String posschar = keypad[ch - '0'];

        for (int i = 0; i < posschar.length(); i++) {
            char ch1 = posschar.charAt(i);
            printKPC(ros, subseq + ch1);

        }
    }

}