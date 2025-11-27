// code for reversing a linklist in iterative way 
/*class Node {
    int data;
    Node next;
}

class LinkedList {
    Node first, temp, ttemp;

    public void insert(int val) {
        Node n = new Node();
        n.data = val;
        n.next = null;

        if(first == null) {
            first = n;
        } else {
            temp = first;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void display() {
        temp = first;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        temp = first;   
        ttemp = null;   
        while(temp != null) {
            first = temp.next; 
            temp.next = ttemp;  
            ttemp = temp;      
            temp = first;       
        }

        first = ttemp;   
    }
}

public class LL1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);

        System.out.print("Original Linked List: ");
        l.display();

        l.reverse();

        System.out.print("Reversed Linked List: ");
        l.display();
    }
}*/

// code for reversing linklist using recursive way
/*class Node {
    int data;
    Node next;
}

class LinkedList {
    Node first;

    // Insert node at end
    public void insert(int val) {
        Node n = new Node();
        n.data = val;
        n.next = null;

        if(first == null) {
            first = n;
        } else {
            Node temp = first;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    // Display linked list
    public void display() {
        Node temp = first;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Recursive reverse helper function
    public Node reverseListRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Public reverse method to update head
    public void reverse() {
        first = reverseListRecursive(first);
    }
}

public class LL1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);

        System.out.print("Original Linked List: ");
        l.display();

        l.reverse();

        System.out.print("Reversed Linked List: ");
        l.display();
    }
}*/

// code for reversing linklist using collection framework 
/*import java.util.*;

public class LL1 {
    public static void main(String[] args) {
       java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Original list: " + list);

        Collections.reverse(list);

        System.out.println("Reversed list: " + list);
    }
}*/


