package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UDLR2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String[] plans = new String[n];
        for (int i = 0; i < n; i++) {
            plans[i] = String.valueOf(st.nextToken());
        }

        int dx[] = {0, 0, -1, 1};
        int dy[] = {-1, 1, 0, 0};
        char[] move = {'L', 'R', 'U', 'D'};
        int x = 1;
        int y = 1;

        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            int nx = -1;
            int ny = -1;

            for (int j = 0; j < 4; j++) {
                if (plan == move[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
