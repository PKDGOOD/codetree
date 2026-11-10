import java.util.*;

public class Main {
    static final int SIZE = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[SIZE];
        for(int i=0; i<SIZE; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for(int i=SIZE-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}