// Java program to merge two sorted linked list 

import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class Linkedlist {

    // Function 
    static Node mergeSortedList(Node a, Node b) {
        ArrayList<Integer> list = new ArrayList<>();
        while (a != null) {
            list.add(a.data);
            a = a.next;
        }

        while (b != null) {
            list.add(b.data);
            b = b.next;
        }

        // Sorting the list
        Collections.sort(list);

        Node temp = new Node(-1);
        Node head = temp;
        for (int value : list) {
            temp.next = new Node(value);
            temp = temp.next;
        }
        head = head.next;

        return head;
    }

    public static void main(String[] args) {

        Node a = new Node(2);
        a.next = new Node(4);
        a.next.next = new Node(8);
        a.next.next.next = new Node(9);

        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(8);
        b.next.next.next = new Node(10);

        Node res = mergeSortedList(a, b);

        Node temp = res;
           System.out.print("Merged Link List is:\n");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
