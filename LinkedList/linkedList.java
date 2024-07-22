package DSA.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class linkedList {

    public static Node insertAtTail(Node head, int data) {

        if (head == null)
            return new Node(data);

        Node newTail = new Node(data);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newTail;

        return head;
    }


    public static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data, head);
        return newNode;
    }

    public static Node convertArrayToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null)
            return head;

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }
    
    public static Node deleteHead(Node head) {

        if(head == null) return head;
        head = head.next;
        return head;

    }
    

    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 35, 8 };
        Node head = convertArrayToLinkedList(arr);
        
        // head = insertAtHead(head, 34);
        // head = new Node(500, head);

        head = insertAtTail(head, 480);
        
        //Printing the LinkedList 
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}