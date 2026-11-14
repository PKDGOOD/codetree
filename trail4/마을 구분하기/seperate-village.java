import java.util.*;

public class Main {
    public static int n;
    public static int[][] grid;
    public static int[][] visited;
    public static int count = 0;
    public static List<Integer> humans = new ArrayList();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
                
        // Please write your code here.
        visited = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(canGo(i, j)) {
                    count = 0;
                    dfs(i, j);
                    humans.add(count);
                }
            }
        }

        System.out.println(humans.size());
        Collections.sort(humans);
        for(int n : humans) {
            System.out.println(n);
        }        
    }

    public static boolean canGo(int x, int y) {
        if(x > n-1 || y > n-1 || x < 0 || y < 0) {
            return false;
        }
        if(grid[x][y] == 0 || visited[x][y] > 0) {
            return false;
        }
        return true;
    }

    public static void dfs(int x, int y) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        visited[x][y]++;
        count++;
        for(int i=0; i<4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(canGo(newX, newY)) {
                dfs(newX, newY);
            }
        }
    }
}