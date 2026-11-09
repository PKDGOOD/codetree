import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int len = a.length();
        int count = 0;
        boolean satisfied = false;

        for(int i=0; i<len; i++) {
            if(a.equals(b)) {
                satisfied = true;   
                break;
            }

            a = a.substring(len-1, len) + a.substring(0, len-1);
            count++;
        }

        if(satisfied) System.out.print(count); 
        else System.out.print(-1);
    }
}