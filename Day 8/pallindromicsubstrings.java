import java.io.*;
import java.util.*;

public class Main {



    public static void solution(String str) {
        for (int sp = 0; sp < str.length(); sp++) {
            for (int ep = sp + 1; ep <= str.length(); ep++) {
                String check = str.substring(sp, ep);

                int val = pallindrome(check);
                if (val == 0) {
                    System.out.println(check);
                }
            }
        }
    }



    public static int pallindrome(String st) {
        int si = 0;
        int ei = st.length() - 1;

        while (si < ei) {

            if (st.charAt(si) != st.charAt(ei)) {
                return 1;
            }

            si++;
            ei--;

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}