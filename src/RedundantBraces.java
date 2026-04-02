import java.util.Scanner;
import java.util.Stack;

public class RedundantBraces {
    // given a string a denoting an expression it contains the following operators
    // -'+','-','*','/'
    // check whether a has redundant braces or not
    // note = a will be always a valid expression and will not contain any white
    // spaces
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter expression : ");
        String a = src.next();
        Stack<Character> st = new Stack<>();
        int res = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == ')') {
                int count = 0;

                while (!st.isEmpty() && st.peek()!='(') {
                    st.pop();
                    count++;
                }
                st.pop();
                if(count==0){
                    res=1;
                    break;
                }
            } else if(ch=='/' || ch=='*' || ch=='-' || ch=='+' || ch=='(') {
                st.push(ch);
            }
        }

        if(res==0){
            System.out.println("No redundant braces");
        }else{
            System.out.println("Has Redundant braces");
        }
        src.close();
    }
}
