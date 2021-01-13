import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner tke = new Scanner(System.in);
        String st = tke.nextLine();
        ArrayList < String > ans = gss(st);
        System.out.println(ans);

    }

    public static ArrayList < String > gss(String str) {
        if (str.length() == 0) {
            ArrayList < String > smallestans = new ArrayList < > ();
            smallestans.add("");
            return smallestans;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1, str.length());

        ArrayList < String > withoutcharans = gss(ros);

        ArrayList < String > withcharans = new ArrayList < > ();

        for (int i = 0; i < withoutcharans.size(); i++) {
            withcharans.add(withoutcharans.get(i));
        }

        for (int i = 0; i < withoutcharans.size(); i++) {
            withcharans.add(ch + withoutcharans.get(i));
        }


        return withcharans;
    }

}