package DSA.LinkedList;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class removeNodeFromLinkedList {

    public static node removenode(node head, int k) {

        if (head == null)
            return head;

        if (k == 1)
            return head.next;

        int count = 0;
        node temp = head;
        while (temp != null) {
            count++;

            if (count == k-1) {
                temp.next = temp.next.next;
                break;
            }

            
            temp = temp.next;
        }
        return head;
    }

    public static node convertArrayToLinkedList(int[] arr) {
        node head = new node(arr[0]);
        node mover = head;

        for (int i = 1; i < arr.length; i++) {
            node temp = new node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void printLL(node head){
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
    
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 4, 9, 3 };
        node head = convertArrayToLinkedList(arr);
        removenode(head, 3);
        printLL(head);

    }
}