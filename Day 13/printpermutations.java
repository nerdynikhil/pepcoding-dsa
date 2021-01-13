import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take = new Scanner(System.in);
        String str = take.nextLine();
        printPermutations(str, "");
    }

    public static void printPermutations(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String left = ques.substring(0, i);
            String right = ques.substring(i + 1);
            String ros = left + right;

            printPermutations(ros, ans + ch);
        }
    }

}