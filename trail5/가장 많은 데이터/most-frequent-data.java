import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        
        int max = 0;
        HashMap<String, Integer> map = new HashMap();
        for(String v : arr) {
            int count = map.getOrDefault(v, 0) + 1;
            map.put(v, count);
            if(count > max) {
                max = count;
            }
        }

        System.out.print(max);
    }
}