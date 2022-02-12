package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class AdventurerGuild {
    public static ArrayList<Integer>arrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        int result = 0;
        int cnt = 0;
        Collections.sort(arrayList);

        for(int i =0; i < n; i ++){
            cnt ++;
            if(cnt >= arrayList.get(i)){
                result +=1;
                cnt = 0;
            }
        }
        System.out.println(result);


    }
}
