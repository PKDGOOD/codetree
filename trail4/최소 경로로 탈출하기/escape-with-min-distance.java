import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int[][] a;
    public static int[][] visited;
    public static int step = 0;
    public static int[][] stepMap;
    public static Queue<int[]> q = new ArrayDeque();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        // Please write your code here.

        stepMap = new int[n][m];
        visited = new int[n][m];
        add(0,0,0);
        bfs();

        if(visited[n-1][m-1] > 0) {
            System.out.print(stepMap[n-1][m-1]);
        }else {
            System.out.print(-1);
        }
    }
    public static void add(int x, int y, int step) {
        q.offer(new int[]{x, y});
        visited[x][y]++;
        stepMap[x][y] = step;
    }

    public static boolean canGo(int x, int y) {
        if(x < 0 || y < 0 || x > n-1 || y > m-1) {
            return false;
        }
        if(visited[x][y] > 0 || a[x][y] == 0) {
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

            for(int i=0; i<4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(canGo(newX, newY)) {
                add(newX, newY, stepMap[x][y] + 1);
            }
        }
        }
    }
}