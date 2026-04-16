import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class PerfectNumber {
    // Given and integer A , you have to find the Ath Perfect Number.
    // A perfect number has the following properties:
    // 1. It comprises only one and two.
    // 2. The number of digits in a perfect number is even.
    // 3. It is a palindrome number.
    // For example , 11,22,112211 are perfect numbers, where 123, 121, 728, 1 are
    // not.
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int A = src.nextInt();
        // Create a queue
        Queue<String> q = new ArrayDeque<>();
        // Insert "1" and "2";
        q.add("1");
        q.add("2");

        // Repeat A times:
        for (int i = 0; i < A; i++) {
            StringBuilder temp = new StringBuilder(q.poll());
            String t = temp.toString();
            String palin = t;
            palin += temp.reverse();
            System.out.print(palin + " ");
            q.add(t + "1");
            q.add(t + "2");
        }

        src.close();
    }
}
