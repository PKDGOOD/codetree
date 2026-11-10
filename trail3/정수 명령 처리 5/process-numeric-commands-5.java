import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList arr = new ArrayList();
        for(int i=0; i<n; i++) {
            String comm = sc.next();
            switch(comm) {
                case "push_back":
                    arr.add(sc.nextInt());
                    break;
                case "pop_back":
                    arr.remove(arr.size()-1);
                    break;
                case "size":
                    System.out.println(arr.size());
                    break;
                case "get":
                    System.out.println(arr.get(sc.nextInt()-1));
                    break;
            }
        }
    }
}