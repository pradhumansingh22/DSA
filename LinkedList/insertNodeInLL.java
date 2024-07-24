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

public class insertNodeInLL {

    public static Node insertNode(Node head, int data, int k) {
        
        if (head == null) 
            return new Node(data);
                
        if (k==1) 
            return new Node(data, head);
        

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;

            if (count == k - 1) {
                Node newNode = new Node(data, temp.next);
                temp.next = newNode;
                break;
            }

            temp = temp.next;
        }
        
        return head;
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


    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 35, 8 };
        Node head = convertArrayToLinkedList(arr);

        head = insertNode(head, 345, 3);

        //Printing the LinkedList 
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
