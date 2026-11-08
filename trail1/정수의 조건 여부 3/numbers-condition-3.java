public class Main {
    public static void main(String[] args) {
        int a = new java.util.Scanner(System.in).nextInt();

        System.out.print(a % 13 == 0 || a % 19 == 0 ? "True" : "False");
    }
}