import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<String> stack = new Stack();

        for(char c : str.toCharArray()) {
            if(c == '(') {
                stack.push("(");
            } else if(stack.isEmpty()) {
                System.out.println("No");
                return;
            } else {
                stack.pop();
            }
            
        }

        if(stack.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}