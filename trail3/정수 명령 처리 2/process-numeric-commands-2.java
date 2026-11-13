import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        Queue<Integer> q = new LinkedList();
        for(int i=0; i<n; i++) {
            String cmd = sc.next();
            switch(cmd) {
                case "push": {
                    q.add(sc.nextInt());
                    break;
                }
                case "pop": {
                    System.out.println(q.poll());
                    break;
                }
                case "size": {
                    System.out.println(q.size());
                    break;
                }
                case "empty": {
                    if(q.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                }
                case "front": {
                    System.out.println(q.peek());
                    break;
                }
            }
        }
    }
}