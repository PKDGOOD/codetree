import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String str = "";
        for(int i=0; i<n; i++) {
            str += sc.next();
        }

        String buffer = "";
        for(int i=0; i<str.length(); i++) {
            buffer += str.charAt(i);
            if(buffer.length() == 5) {
                System.out.println(buffer);
                buffer = "";
            }
        }
        if(buffer != "") {
            System.out.println(buffer);
        }
    }
}