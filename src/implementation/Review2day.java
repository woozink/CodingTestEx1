package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//public class Review2day {
//    public static int x, y, m, n, direction;
//
//    public static int[][] d = new int[50][50];
//    public static int[][] arr = new int[50][50];
//
//    public static int dx[] = {-1, 0, 1, 0};
//    public static int dy[] = {0, 1, 0, -1};
//
//    public static void turn_left(){
//        direction -= 1;
//        if(direction == -1) direction =3;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        x = Integer.parseInt(st.nextToken());
//        y = Integer.parseInt(st.nextToken());
//        direction = Integer.parseInt(st.nextToken());
//
//        d[x][y] = 1;
//
//        for(int i = 0; i < n; i ++){
//            st = new StringTokenizer(br.readLine());
//            for(int j = 0; j < m; j ++){
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        //시뮬레이션 시작
//        int cnt = 1;
//        int turn_time = 0;
//
//        while(true){
//            turn_left();
//            int nx = x + dx[direction];
//            int ny = y + dy[direction];
//
//            if(d[nx][ny] ==0 && arr[nx][ny] == 0){
//                d[nx][ny] = 1;
//                x = nx;
//                y = ny;
//                cnt+= 1;
//                turn_time =0;
//                continue;
//            }
//            else{
//                turn_time += 1;
//            }
//
//            if(turn_time == 4){
//                nx = x - dx[direction];
//                ny = y - dy[direction];
//
//                //뒤로 갈수 있다면
//                if(arr[nx][ny] == 0){
//                    x = nx;
//                    y = ny;
//                }
//                else break;
//                turn_time = 0;
//            }
//        }
//        System.out.println(cnt);
//    }
//
//}

//public class Review2day {
//    public static String str;
//    public static int summary;
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        str = br.readLine();
//
//        for (int i = 0; i < str.length() / 2; i++) {
//            summary += str.charAt(i) - '0';
//
//        }
//        for (int i = str.length() / 2; i < str.length(); i++) {
//            summary -= str.charAt(i) - '0';
//        }
//        if (summary == 0) System.out.println("LUCKY");
//        else {
//            System.out.println("READY");
//        }
//    }
//
//}

public class Review2day{
    public static String str;
    public static int value;
    public static ArrayList<Character> result = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        for(int i = 0; i< str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                result.add(str.charAt(i));
            }
            else{
                value += str.charAt(i)-'0';
            }
        }
        Collections.sort(result);

        for(int i = 0 ; i < result.size(); i++){
            System.out.println(result.get(i));

        }
        if(value != 0 ) System.out.println(value);
        System.out.println();
    }
}