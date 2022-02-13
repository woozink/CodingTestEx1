package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultipleOrAdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        long result = str.charAt(0) - '0';

        for (int i = 1; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if (num <= 1 || num <= 0) {
                result += num;
            } else {
                result *= num;
            }
        }
        System.out.println(result);
    }
}
