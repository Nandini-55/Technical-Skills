import java.util.Stack;
// A stack is a linear data structure that follows a lifo (last in first out)
// This means the last element inserted is the first one to be removed 
// e.g – browser history .
// operations - :
            // push – add an element to the top of the stack // check for overflow (stack is full)
            // pop – remove the top element from the stack /// check for underflow (stack is empty)
            // isEmpty – check whether the stack is empty or not , return true if stack is empty , and return false if stack has elments . 

public class StackBasics {
    //  write a program to implement stack operations - push , pop and isEmpty
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(20);
        st.push(50);

        System.out.println(st.pop());

        st.peek();
        
        System.out.println(st.isEmpty());
       
    }
}
