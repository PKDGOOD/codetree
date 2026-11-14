import java.util.*;

public class Main {
    public static int n;
    public static int[][] grid;
    public static int[][] visited;
    public static int node;
    public static int popCount = 0;
    public static int maxNodeSize = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        visited = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                node = grid[i][j]; // 같은 가중치인 곳만 갈 수 있도록 초기화 밑에 canGo에서 쓸거임
                if(canGo(i, j)) {
                    int count = dfs(i, j);
                    if(count >= 4) popCount++;
                    maxNodeSize = Math.max(maxNodeSize, count);
                }
            }
        }

        System.out.print(popCount + " " + maxNodeSize);
    }
    // 이동 가능한 노드인지 체크
    public static boolean canGo(int x, int y) {
        if(x < 0 || y < 0 || x > n-1 || y > n-1) {
            return false;
        }
        if(visited[x][y] > 0 || grid[x][y] != node) {
            return false;
        }

        return true;
    }

    public static int dfs(int x, int y) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        visited[x][y]++;
        int count = 1;
        for(int i=0; i<4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(canGo(newX, newY)) {
                count += dfs(newX, newY);
            }
        }
        return count;
    }

}