
//Given a string a consisting only of '(' and ')'. you need to find whether paranthese in a are balanced or not .if it is balanced then return 1 else return 0.
// Input format - first argument is  string a 
//Output format - return 1 if paranthese in the string are balanced else return 0.
//E.g. - A="(()())" - 1 
//       A= "(()" - 0
//      A=")()"
//      A="()))"

//Algorithm - 
// if it is a '(' , push it into the stack
// if it is a ')' , pop from the string
// if the stack becomes empty when trying to pop - it is not balanced
// after processing the whole string if the stack is empty - it is balanced 

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String a = src.next();
        Stack<Character> s = new Stack<>();
        int res = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == '(') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    res = 0;
                    break;
                } else {
                    res = 1;
                    s.pop();
                }
            }
        }

        if (s.isEmpty() && res == 1) {
            res = 1;
        } else {
            res = 0;
        }
        System.out.println(res);
        src.close();

    }
}