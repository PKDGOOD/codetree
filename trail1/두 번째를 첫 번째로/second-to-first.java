import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);

        char[] arr = str.toCharArray();
        for(int i=0; i < arr.length; i++) {
            char tmp = arr[i];
            if(arr[i] == ch2) tmp = ch1;

            System.out.print(tmp);
        }
    }
}