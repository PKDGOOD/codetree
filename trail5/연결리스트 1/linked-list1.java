import java.util.Scanner;

class Node {
    String s;
    Node prev;
    Node next;

    public Node(String s) {
        this.s = s;
        this.prev = null;
        this.next = null;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sInit = sc.nextLine();
        Node cur = new Node(sInit);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int comm = sc.nextInt();
            String sValue = null;
            Node newNode = null;
            if(comm == 1 || comm == 2) {
                sValue = sc.next();
                newNode = new Node(sValue);
            }
            switch(comm) {
                case 1:
                    newNode.prev = cur.prev;
                    newNode.next = cur;
                    if(newNode.prev != null) {
                        newNode.prev.next = newNode;
                    }
                    if(newNode.next != null) {
                        newNode.next.prev = newNode;
                    }
                    break;
                case 2:
                    newNode.next = cur.next;
                    newNode.prev = cur;
                    if(newNode.prev != null) {
                        newNode.prev.next = newNode;
                    }
                    if(newNode.next != null) {
                        newNode.next.prev = newNode;
                    }
                    break;
                case 3:
                    if(cur.prev != null) {
                        cur = cur.prev;
                    }
                    break;
                case 4:
                    if(cur.next != null) {
                        cur = cur.next;
                    }
                    break;
            }
            // System.out.println("Comm : " + comm);
            System.out.print((cur.prev != null ? cur.prev.s : "(Null)") + " ");
            System.out.print(cur.s + " ");
            System.out.print((cur.next != null ? cur.next.s : "(Null)") + "\n");
        }
    }
}