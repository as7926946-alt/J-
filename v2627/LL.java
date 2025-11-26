import java.util.*;

// code for insertion deletion of a node in linklist 
/*class LL {
   Node head;
   private int size;
   LL () {
       size = 0;
   }
   public class Node {
       String data;
       Node next;
       Node(String data) {
           this.data = data;
           this.next = null;
           size++;
       }
   }
   
   // code to add a node at first
    public void addFirst(String data) {
       Node newNode = new Node(data);
       newNode.next = head;
       head = newNode;
   }

   // code to add a node at last
   public void addLast(String data) {
       Node newNode = new Node(data);
       if(head == null) {
           head = newNode;
           return;
       }
       Node lastNode = head;
       while(lastNode.next != null) {
           lastNode = lastNode.next;
       }
       lastNode.next = newNode;
   }

   // code to printlist 
   public void printList() {
       Node currNode = head;
       while(currNode != null) {
           System.out.print(currNode.data+" -> ");
           currNode = currNode.next;
       }
       System.out.println("null");
   }

   // code to remove first node
   public void removeFirst() {
       if(head == null) {
           System.out.println("Empty List, nothing to delete");
           return;
       }
          head = this.head.next;
       size--;
   }

   // code to remove last node 
   public void removeLast() {
       if(head == null) {
           System.out.println("Empty List, nothing to delete");
           return;
       }
       size--;
       if(head.next == null) {
           head = null;
           return;
       }
       Node currNode = head;
       Node lastNode = head.next;
       while(lastNode.next != null) {
           currNode = currNode.next;
           lastNode = lastNode.next;
       }
       currNode.next = null;
   }

   // To check size of the list
   public int getSize() {
       return size;
   }
       // code to insert at any index ie middle in list 
       public void addInMiddle(int index, String data) {
       if(index > size || index < 0) {
           System.out.println("Invalid Index value");
           return;
       }
       size++;


       Node newNode = new Node(data);
       if(head == null || index == 0) {
           newNode.next = head;
           head = newNode;
           return;
       }
        Node currNode = head;
       for(int i=1; i<size; i++) {
           if(i == index) {
               Node nextNode = currNode.next;
               currNode.next = newNode;
               newNode.next = nextNode;
               break;
           }
           currNode = currNode.next;
       }
   }
   public static void main(String args[]) {
       LL list = new LL();
       list.addLast("is");
       list.addLast("a");
       list.addLast("list");
       list.printList();
       list.addFirst("this");
       list.printList();
       System.out.println(list.getSize()); 
       list.removeFirst();
       list.printList();
       list.removeLast();
       list.printList();
       list.addInMiddle(1, "Are");
       list.printList();
   }
}*/

// linklist using collection framework 
 /*class LL{
    public static void main(String[]args){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(30);
        list.add(40);
        list.addFirst(20);
        list.addLast(50);
        list.add(0,10);
        System.out.println("The created linklist is ");
        System.out.println(list);
        System.out.println("The choosen number is");
        System.out.println(list.get(0));
        System.out.println("The size of the linklist is");
        System.out.println(list.size());
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
 }*/

// code for searching a number and displaying its index
/*class LL{
    public static void main(String[]args){
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.addFirst(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.addLast(3);
        System.out.println("The created linklist is");
        System.out.println(list);
        int target =7;
        int index=list.indexOf(target);
        if(index!=-1){
            System.out.println(target+" " +"found at index"+" "+index);
        }
        else{
            System.out.println(target +"not found at index");
        }
    }
}*/

// code for taking elements as input from user and deleting elemnets that have value more than 25
/*class LL{
    public static void main(String[]args){
        LinkedList<Integer> list=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to add in linklist");
        int element=sc.nextInt();
        list.add(element);
        System.out.println("The linklist is");
        System.out.println(element);
        System.out.println("Do you want to continue adding numbers");
        System.out.println("Press 1 for Yes and 2 for No"); 
        int choice=sc.nextInt();
        while(choice==1){
            System.out.println("Enter the element to add in linklist");
             element =sc.nextInt();
            list.add(element);
            System.out.println("The updated linklist is");
            System.out.println(list);
            System.out.println("Do you want to continue adding numbers");
            System.out.println("Press 1 for Yes and 2 for No");
            choice=sc.nextInt();
        }
            System.out.println("The final created linklist is");
            System.out.println(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>25){
                list.remove(i);
                i--;
            }
        }
        System.out.println("The linklist after deleting numbers greater than 25 is");
        System.out.println(list);
    }

}*/