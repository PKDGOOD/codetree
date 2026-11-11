import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap();
        for(int v : arr) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        for(int q: queries) {
            System.out.print(map.getOrDefault(q, 0) + " ");
        }

    }
}