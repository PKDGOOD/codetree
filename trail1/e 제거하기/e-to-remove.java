import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        String result = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
                result = str.substring(0,i) + str.substring(i+1);
                break;
            }
        }

        System.out.print(result);
    }
}