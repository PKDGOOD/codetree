import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
            if(words[i].substring(0, t.length()).equals(t)) count++;
        }
        // Please write your code here.
        String[] arr = new String[count];
        int i=0;
        for(String word : words) {
            if(word.substring(0, t.length()).equals(t)) {
                arr[i] = word;
                i++;
            }
        }

        Arrays.sort(arr);
        System.out.print(arr[k-1]);
    }
}