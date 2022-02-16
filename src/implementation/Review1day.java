package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 상하좌우 문제
//public class Review1day {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        String[] plans = new String[n];
//
//        for(int i =0; i < n; i++){
//            plans[i] = String.valueOf(st.nextToken());
//        }
//
//        int[] dx = {0, 0 ,-1,1};
//        int[] dy = {-1, 1, 0,0};
//        char[] move = {'L', 'R', 'U','D'};
//        int y = 1;
//        int x = 1;
//
//        for(int i =0; i < plans.length; i++){
//            char plan = plans[i].charAt(0);
//            int nx = 1;
//            int ny = 1;
//
//            for(int j = 0; j < 4; j ++){
//                if(plan == move[j]){
//                    nx = x+ dx[j];
//                    ny = y + dy[j];
//                }
//            }
//            if(nx < 1 || nx > n || ny <1 | ny >n){
//                continue;
//            }
//            x = nx;
//            y = ny;
//        }
//        System.out.println(x + " "+ y);
//    }
//}
//시간 문제
//public class Review1day {
//    public static boolean check (int h, int m, int s){
//        if(h % 10 ==3 || h/10 ==3|| m/10 == 3||m%10 ==3 || s%3==3||s/10==3)return true;
//        return false;
//
//    }
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int h = Integer.parseInt(br.readLine());
//        int count = 0;
//        for(int i = 0; i <= h; i++){
//            for(int j=0; j <60; j ++){
//                for(int k = 0; k<60; k++){
//                    if(check(i,j,k )) count ++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}
public class Review1day {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputData = br.readLine();
        int row = inputData.charAt(1) - '0';
        int column = inputData.charAt(0) - 'a' +1;

        // 나이트가 갈 수 있는 8가지 방향
        int[] dx = {-2,-1,1,2,2,1,-1,-2};
        int[] dy = {-1,-2,-2,-1,1,2,2,1};

        int result = 0;
        for(int i = 0; i<8; i ++){
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];

            if(nextRow >= 1 && nextRow <= 8&& nextColumn >= 1 && nextColumn <= 8){
                result += 1;
            }
        }
        System.out.println(result);
    }
}
