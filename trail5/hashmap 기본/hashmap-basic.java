import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        HashMap<Integer, Integer> m = new HashMap();
        for(int i=0; i<n; i++) {
            String comm = sc.next();           
            if(comm.equals("add")) {
                int k = sc.nextInt();
                int v = sc.nextInt();
                m.put(k, v);
            } 
            if(comm.equals("remove")) {
                int k = sc.nextInt();
                m.remove(k);
            } 
            if (comm.equals("find")) {
                int k = sc.nextInt();
                if(m.containsKey(k)) {
                    System.out.println(m.get(k));
                } else {
                    System.out.println("None");
                }
            }
        }
    }
}