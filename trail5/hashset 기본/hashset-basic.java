import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            int x = sc.nextInt();
            switch(command) {
                case "add": 
                    set.add(x);
                    break;
                case "remove": 
                    set.remove(x);
                    break;
                case "find": 
                    System.out.println(set.contains(x));
                    break;
            }
        }
    }
}