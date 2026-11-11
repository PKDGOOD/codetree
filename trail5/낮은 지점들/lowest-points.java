import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(!map.containsKey(x)) {
                map.put(x, y);
                sum += y;
            } else {
                int tmp = map.get(x);
                if(y < tmp) {
                    sum -= tmp;
                    map.put(x, y);
                    sum += y;
                }
            }
        }
        System.out.print(sum);
    }
}