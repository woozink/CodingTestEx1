package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KingdomKnight {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputData = br.readLine();
        int row = inputData.charAt(1) - '0';
        int column = inputData.charAt(0) - 'a' + 1;

        //나이트가 갈수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        //8가지 방향에 대해서 각 위치로 이동이 가능한지 확인

        int result = 0;
        for (int i = 0; i < 8; i++) {
            //이동하고자 하는 위치를 확인
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            //해당 위치로 이동이 가능한지 확인
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1;
            }
        }
        System.out.println(result);

    }
}
