package bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FreezeDrinks {
    public static int n, m;
    public static int[][] graph = new int[1001][1001];
    //DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문

    public static boolean dfs(int x, int y) {
        //주어진 범위를 벗어나는 경우는 즉시 종료
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }
        if (graph[x][y] == 1) {
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        } else return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}
