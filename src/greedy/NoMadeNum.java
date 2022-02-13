package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class NoMadeNum {
    public static int n;
    public static ArrayList<Integer>arrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i ++){
            arrayList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arrayList);

        int temp = 1;
        for(int i =0; i<n; i++){
            if(temp < arrayList.get(i)){
                break;
            }
            else{
                temp += arrayList.get(i);
            }
        }
        System.out.println(temp);
    }
}
