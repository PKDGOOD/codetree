public class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();

        int cnt = 0;
        while(true) {
            if(n % 2 == 0) {
                n = n*3 +1;
            } else {
                n = n*2 +2;
            }
            cnt++;

            if(n >= 1000) break;
        }

        System.out.print(cnt);
    }
}