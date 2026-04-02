import java.util.Scanner;
import java.util.Stack;

public class RemoveChar {
    // You have a string denoted as 'a' to transform the string, you have to perform
    // the following operations:
    // 1. identify the first occurrence of consecutive identical pairs of characters
    // with in the string
    // 2. remove this pair of identical characters from the string
    // 3. repeat step 1 and 2 until their are no more consecutive identical pairs of
    // characters
    // 4. the final result will be the transformed string.

    // solution :
    // create an empty stack
    // traverse the string from left to right
    // for each step if stack is not empty and top of the stack is equals to the
    // current character , then remove the top element ,else push the current
    // character into the stack.
    // repeat until all character are traversed and convert stack to string
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter string: ");
        String A = src.nextLine();
        // String A = "abccbc";
        StringBuilder res = new StringBuilder("");
        Stack<Character> ch = new Stack<>();
        ch.push(A.charAt(0));
        for (int i = 1; i < A.length(); i++) {

            if (!ch.isEmpty() && ch.peek() == A.charAt(i)) {
                ch.pop();
            } else {
                ch.push(A.charAt(i));
            }
        }
        while (!ch.isEmpty()) {
            res.append(ch.pop());
        }

        res.reverse();
        System.out.println(res);
        src.close();
    }
}
