import java.util.Scanner;
import java.util.Stack;

public class BracketValid {
    // Given an expression string A , examine whether the pairs and the orders of
    // '{','}','(',')','[',']' are correct in A . return 0 if the parenthese
    // sequence is not balances , else return 1
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String a = src.next();
        Stack<Character> s = new Stack<>();
        int res = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (!s.isEmpty() && ((ch == ')' && s.peek() == '(') || (ch == '}' && s.peek() == '{')
                        || (ch == ']' && s.peek() == '['))) {
                    res = 1;
                    s.pop();
                } else {
                    res = 0;
                    break;
                }
            }
        }

        if (s.isEmpty() && res == 1) {
            res = 1;
        } else {
            res = 0;
        }
        System.out.println(res);
    }
}
