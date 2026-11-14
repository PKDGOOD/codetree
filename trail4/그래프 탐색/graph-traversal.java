import java.util.*;

public class Main {
    public static int[] visited;
    public static int answer;
    public static List<List<Integer>> graph = new ArrayList();
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] u = new int[m];
        int[] v = new int[m];
        for (int i = 0; i < m; i++) {
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList());
        }
        for(int i=0; i<m; i++) {
            int node1 = u[i];
            int node2 = v[i];
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        visited = new int[n+1];
        dfs(1);
        System.out.println(answer);
    }

    static void dfs(int cur) {
        if(visited[cur] == 0) {
            if(cur != 1) answer++;
            visited[cur]++;

            for(int node : graph.get(cur)) {
                dfs(node);
            }
        }
        return;
    }
}