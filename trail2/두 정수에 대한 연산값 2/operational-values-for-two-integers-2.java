import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper A = new IntWrapper(a);
        IntWrapper B = new IntWrapper(b);

        modify(A, B);

        System.out.print(A.value + " " + B.value);

    }

    public static void modify(IntWrapper a, IntWrapper b) {
        if(a.value > b.value) {
            a.value *= 2;
            b.value += 10;
        } else {
            b.value *= 2;
            a.value += 10;
        }
    }
}