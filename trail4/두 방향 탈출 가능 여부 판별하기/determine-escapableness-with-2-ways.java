import java.util.*;

public class Main {
    public static int answer = 0;
    public static int[][] visited;
    public static int n;
    public static int m;
    public static int[][] grid;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        visited = new int[n][m];
        dfs(0, 0);
        System.out.print(answer);
    }

    static boolean available(int x, int y) {
        // 그리드 바깥으로 벗어날 수 없음
        if(x > n-1 || y > m-1) {
            return false;
        }

        // 뱀이 있거나 이미 방문했으면 갈수 없음
        if(grid[x][y] == 0 || visited[x][y] > 0) {
            return false;
        }
        return true;
    }

    static void dfs(int x, int y) {
        int[] dx = {0 ,1};
        int[] dy = {1 ,0};
        
        visited[x][y]++;
        if(x == n-1 && y == m-1) {
            answer = 1; // 어떤 경로였든 목적지에 도착했으면 도착여부 남긴다.
            return;
        }
        for(int i=0; i<2; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(available(newX, newY)) {
                dfs(newX, newY);
            }
        }
        return;
    }
}