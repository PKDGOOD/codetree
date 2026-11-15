import java.util.*;

public class Main {
    public static int n;
    public static int k;
    public static int[][] grid;
    public static int[][] visited;
    public static Queue<int[]> q = new ArrayDeque();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int[][] starts = new int[k][2];
        for (int i = 0; i < k; i++) {
            starts[i][0] = sc.nextInt();
            starts[i][1] = sc.nextInt();
        }
        // Please write your code here.
        visited = new int[n][n];
        for(int i=0; i<k; i++) {
            add(starts[i][0]-1, starts[i][1]-1);
            bfs();
        }
        int count =0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if(visited[i][j] > 0) count++;

        System.out.print(count);
    }

    public static void add(int x, int y) {
        q.offer(new int[]{x,y});
        visited[x][y]++;
    }

    public static boolean canGo(int x, int y) {
        if(x < 0 || y < 0 || x > n-1 || y > n-1) {
            return false;
        }
        if(visited[x][y] > 0 || grid[x][y] == 1) {
            return false;
        }
        return true;
    }

    public static void bfs() {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!q.isEmpty()) {
            int[] next = q.poll();
            for(int i=0; i<4; i++) {
                int nextX = next[0] + dx[i];
                int nextY = next[1] + dy[i];
                if(canGo(nextX, nextY)) {
                    add(nextX, nextY);
                }
            }
        }
    }
}