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
            String sValue = sc.next();
            Node newNode = new Node(sValue);
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
                        Node tmp = cur.prev;
                        if(cur.prev.prev != null) {
                            cur.prev.prev.next = cur;
                            cur.prev = cur.prev.prev;
                        } else {
                            cur.prev = null;
                        }
                        tmp.prev = null;
                        tmp.next = null;
                    }
                    break;
                case 4:
                    if(cur.next != null) {
                        Node tmp = cur.next;
                        if(cur.next.next != null) {
                            cur.next.next.prev = cur;
                            cur.next = cur.next.next;
                        } else {
                            cur.next = null;
                        }

                        tmp.prev = null;
                        tmp.next = null;
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