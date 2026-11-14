import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static List<Integer> list = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.

        choose(1);
    }

    static void choose(int cur) {
        if(list.size() == m) {
            for(int v : list) {
                System.out.print(v + " ");
            }
            System.out.println();
            return;
        }

        for(int i = cur; i<=n; i++) {
            list.add(i);
            choose(i+1);
            list.remove(list.size()-1);
        }
    }
}