import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aMath = sc.nextInt();
        int aEng = sc.nextInt();
        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

        if(aMath > bMath || (aMath == bMath && aEng > bEng)) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
    }
}