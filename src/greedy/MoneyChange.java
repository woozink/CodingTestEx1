package greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MoneyChange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int first = arr[n-1];
        int second = arr[n-2];

        int cnt = (m/(k+1)*k);
        cnt += m%(k+1);

        int result = cnt * first;
        result += (m-cnt) *second;

        System.out.println(result);
    }
}
