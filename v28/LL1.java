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

// code for swaping nodes in pair

/*class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; } 
    }

    void insert(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
            return;
        }
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = n;
    }

    void swapPairs() {
        if (head == null || head.next == null) return;

        Node temp = null;       // previous node of pair
        Node first = head;      // first node of current pair
        Node p = head.next;     // second node of current pair

        head = p;               // new head after first swap

        while(first != null && p != null) {
            Node ttemp = p.next; // backup next node

            p.next = first;      // swap
            first.next = ttemp;

            if(temp != null) temp.next = p; // connect previous pair

            // move pointers for next pair
            temp = first;
            first = first.next;
            if (first != null)
    p = first.next;
else
    p = null;

        }
    }

    void printList() {
        Node n = head;
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
public class LL1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        System.out.println("Before swap:");
        list.printList();

        list.swapPairs();

        System.out.println("After swap:");
        list.printList();
    }
}*/




