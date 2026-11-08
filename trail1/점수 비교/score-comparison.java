import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aMath = sc.nextInt();
        int aEng = sc.nextInt();
    
        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

        System.out.println(((aMath > bMath) && (aEng > bEng)) ? 1 : 0);
    }
}