package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LuckyStraight {
    public static String str;
    public static int summary;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        for (int i = 0; i < str.length() / 2; i++) {
            summary += str.charAt(i) - '0';
        }
        for (int i = str.length() / 2; i < str.length(); i++) {
            summary -= str.charAt(i) - '0';
        }
        if (summary == 0) System.out.println("LUCKY");
        else System.out.println("READY");


    }
}

