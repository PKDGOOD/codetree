import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int count = 0;
        for(int i=0; i<a.length()-1; i++) {
            if(a.substring(i, i+2).equals(b)) count++;
        }

        System.out.print(count);
    }
}