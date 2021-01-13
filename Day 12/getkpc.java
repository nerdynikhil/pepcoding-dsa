import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner take = new Scanner(System.in);
        String st = take.nextLine();
        ArrayList < String > ans = getKPC(st);
        System.out.println(ans);
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

    public static ArrayList < String > getKPC(String str) {
        if (str.length() == 0) {
            ArrayList < String > tempres = new ArrayList < > ();
            tempres.add("");
            return tempres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1, str.length());

        ArrayList < String > smallres = getKPC(ros);
        ArrayList < String > fres = new ArrayList < > ();

        String passchar = keypad[ch - '0'];

        for (int i = 0; i < passchar.length(); i++) {
            char ch1 = passchar.charAt(i);


            for (int j = 0; j < smallres.size(); j++) {
                fres.add(ch1 + smallres.get(j));
            }

        }

        return fres;
    }

}