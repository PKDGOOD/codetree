import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int[][] grid;
    public static int[][] visited;
    public static Queue<int[]> q = new ArrayDeque();
    public static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        visited = new int[n][m];
        q.offer(new int[]{0,0});
        visited[0][0]++;
        bfs();

        System.out.print(answer);
    }

    public static boolean canGo(int x, int y) {
        if(x < 0 || y < 0 || x > n-1 || y > m-1) {
            return false;
        }
        if(visited[x][y] > 0 || grid[x][y] == 0) {
            return false;
        }
        return true;
    }

    public static void bfs() {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        while(!q.isEmpty()) {
            int[] next = q.poll();
            int x = next[0];
            int y = next[1];
            if(x == n-1 && y == m-1) {
                answer = 1;
            }
            for(int i=0; i<4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if(canGo(nextX, nextY)) {
                    q.offer(new int[]{nextX, nextY});
                    visited[nextX][nextY]++;
                }
            }
        }
    }
}