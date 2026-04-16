//Create a linked list containing values from 1 to n.
// Approach - create first node head with value 1.
//use a pointer temp to keep track of last node.
//loop from 2 to n.
//for each value :
//create new node
//attach it to temp.next
//move temp forward 
//return head

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedListBasics {

    public static Node createLL(int n) {
        if (n <= 0) {
            return null;
        }
        Node head = new Node(1);
        Node temp = head;
        for (int i = 2; i <= n; i++) {
            Node curr = new Node(i);
            temp.next = curr;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        Node head = createLL(n);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
