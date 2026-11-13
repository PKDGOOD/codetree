import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        // Please write your code here.
        Set<Integer> lSet = new HashSet();
        Set<Integer> rSet = new HashSet();
        for(int v : A) {
            lSet.add(v);
        }
        for(int v : B) {
            lSet.remove(v);
        }
        for(int v : B) {
            rSet.add(v);
        }
        for(int v : A) {
            rSet.remove(v);
        }

        Set<Integer> cSet = lSet;
        for(int v : rSet) {
            cSet.add(v);
        }
        System.out.print(cSet.size());
    }
}