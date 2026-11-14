import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int[][] grid;
    public static int[][] visited;
    public static List<Integer> safe;

    public static int k = 1;
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        for(int rain=1; rain<=100; rain++) {
            safe = new ArrayList();
            visited = new int[n][m];
            
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(canGo(i, j, rain)) {
                        safe.add(1);
                        dfs(i,j, rain);
                    }
                }
            }

            if(safe.size() > count) {
                k = rain;
                count = safe.size();
            }
        }
        System.out.println(k + " " + count);

    }
    
    public static void dfs(int x, int y, int k) {
        int[] dx = {1, 0 , -1, 0};
        int[] dy = {0 , 1, 0, -1};

        visited[x][y]++;
        for(int i=0; i<4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(canGo(newX, newY, k)) {
                dfs(newX, newY, k);
            }
        }
    }
    public static boolean canGo(int x, int y, int k) {
        if(x < 0 || y < 0 || x > n-1 || y > m-1) {
            return false;
        }
        if(visited[x][y] > 0 || grid[x][y] <= k) {
            return false;
        }
        return true;
    }
}