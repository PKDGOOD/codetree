import java.util.Scanner;
import java.util.HashMap;

class Node {
    int id;
    Node prev;
    Node next;

    public Node(int id) {
        this.id = id;
        this.prev = null;
        this.next = null;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        HashMap<Integer, Node> map = new HashMap();
        for(int i=1; i<=n; i++) {
            map.put(i, new Node(i));
        }
        int q = sc.nextInt();

        for(int c=0; c<q; c++) {
            int cmd = sc.nextInt();
            int i, j;
            switch(cmd) {
                // 선택노드 제거 후 좌우 붙이기
                case 1:
                    i = sc.nextInt();
                    Node tmp = map.get(i);
                    if(tmp.prev != null) {
                        tmp.prev.next = tmp.next;
                    }
                    if(tmp.next != null) {
                        tmp.next.prev = tmp.prev;
                    }
                    tmp.prev = null;
                    tmp.next = null;
                    break;
                case 2:
                    i = sc.nextInt();
                    j = sc.nextInt();
                    map.get(j).prev = map.get(i).prev;
                    map.get(j).next = map.get(i);
                    if(map.get(i).prev != null) {
                        map.get(i).prev.next = map.get(j);
                    }
                    map.get(i).prev = map.get(j);
                    break;
                case 3:
                    i = sc.nextInt();
                    j = sc.nextInt();
                    map.get(j).prev = map.get(i);
                    map.get(j).next = map.get(i).next;
                    if(map.get(i).next != null) {
                        map.get(i).next.prev = map.get(j);
                    }
                    map.get(i).next = map.get(j);
                    break;
                case 4:
                    i = sc.nextInt();
                    if(map.get(i).prev != null) {
                        sb.append(map.get(i).prev.id + " ");
                        // System.out.print(map.get(i).prev.id + " ");
                    } else {
                        sb.append(0 + " ");
                        // System.out.print(0 + " ");
                    }
                    if(map.get(i).next != null) {
                        sb.append(map.get(i).next.id + " ");
                        // System.out.print(map.get(i).next.id + " ");
                    } else {
                        sb.append(0 + " ");
                        // System.out.print(0 + " ");
                    }
                    // sb.append("\n");
                    System.out.println(sb.toString());
                    break;
            }
        }
        // StringBuilder sb = new StringBuilder();   
        for(int i=1; i<=n; i++) {
            Node nextNode = map.get(i).next;
            if(nextNode == null) {
                sb.append(0 + " ");
                // System.out.print(0 + " ");
            } else {
                sb.append(nextNode.id + " ");
                // System.out.print(nextNode.id + " ");
            }
        }
        System.out.println(sb.toString());
    }
}