import java.util.*;

public class Main {
    public static int n;
    public static int step = 0;
    public static int[][] stepMap;
    public static int[][] visited;
    public static Queue<int[]> q = new ArrayDeque();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        stepMap = new int[n][n];
        visited = new int[n][n];
        add(r1-1, c1-1, 0);
        bfs();

        if(visited[r2-1][c2-1] > 0) {
            System.out.println(stepMap[r2-1][c2-1]);
        } else {
            System.out.println(-1);
        }
        
    }
    public static void add(int x, int y, int step) {
        q.offer(new int[]{x, y});
        visited[x][y]++;
        stepMap[x][y] = step;
    }
    public static boolean canGo(int x, int y) {
        if(x < 0 || y < 0 || x > n-1 || y > n-1) {
            return false;
        }
        if(visited[x][y] > 0) {
            return false;
        }
        return true;
    }

    public static void bfs() {
        int[] dx = {1 , 2, 2, 1, -1, -2, -2, -1};
        int[] dy = {2 , 1, -1, -2, -2, -1, 1, 2};

        while(!q.isEmpty()) {
            int[] next = q.poll();
            int x = next[0];
            int y = next[1];
            for(int i=0; i<8; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if(canGo(newX, newY)) {
                    add(newX, newY, stepMap[x][y]+1);
                }
            }
        }
    }
}