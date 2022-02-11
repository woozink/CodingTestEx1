package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IntSummaryStatistics;
import java.util.StringTokenizer;

public class Becomes1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int cnt = 0;

        while(n != 1){
            if(n %k !=0){
                n = n-1;
                cnt++;
            }
            else{
                n = n/k;
                cnt++;
            }
        }
        System.out.println(cnt);


    }
}
