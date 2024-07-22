package DSA.LinkedList;

 
class node {

    int data;
    node next;
    node prev;

    node(int data, node next, node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleyLinkedList {

    static node convert(int[] arr) {

        node head = new node(arr[0]);
        node back = head;

        for (int i = 1; i < arr.length; i++) {

            node temp = new node(arr[i], null, back);

            back.next = temp;
            back = temp; //back = back.next;

        }
        return head;
    }

    
    //-----DELETE THE HEAD OF A DOUBLEY LINKED LIST-----//
    static node deleteHead(node head) {

        if (head == null || head.next == null)
            return null;

        node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;

        return head;

    }
    

    //-----DELETE THE TAIL OF A DOUBLEY LINKED LIST-----//
    static node deleteTail(node head) {

        if (head == null || head.next == null)
            return null;

        node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.prev.next = null;
        tail.prev = null;

        return head;
    }
    
    
    //-----DELETE THE Kth NODE OF A DOUBLEY LINKED LIST----//
    static node deleteAnyNode(node head, int k) {

        node temp = head;
        int count = 0;

        while (temp != null) {

            count++;
            if (count == k)
                break;

            temp = temp.next;
        }

        node previous = temp.prev; //previous of the kth node
        node front = temp.next; //next of the kth node

        if (previous == null && front == null) {
            return null;
        }
        if (previous == null) {
            return deleteHead(head);
        }
        if (front == null) {
            return deleteTail(head);
        }

        previous.next = front;
        front.prev = previous;
        temp.next = null;
        temp.prev = null;

        return head;
    }
    
    //-----DELETE NODE-----//
    static void deleteNode(node target) {

        node previous = target.prev;
        node front = target.next;

        if (front == null) {
            previous.next = null;
            target.prev = null;
        }

        previous.next = front;
        front.prev = previous;

        target.next = target.prev = null;
    }
    

    //-----INSERT NEW NODE AT THE START OF A DOUBLEY LINKED LIST-----//
    static node insertHead(node head, int value) {

        node newNode = new node(value, head, null);
        head.prev = newNode;

        return newNode;
    }
    

    //-----INSERT NEW NODE AT THE END OF A DOUBLEY LINKED LIST-----//
    static node insertTail(node head, int value) {

        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        node newNode = new node(value, null, temp);
        temp.next = newNode;

        return head;
    }


    //-----INSERT A NEW NODE AT THE Kth POSTION OF A DOUBLEY LINKED LIST-----//
    static node insertAtKthPosition(node head, int value, int k) {
        
        if (k == 1)
            return insertHead(head, value);
        
        node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            if (count == k)
                break;
            temp = temp.next;
        }

        if (count < k) { // If k exceeds the length of the list, insert at the end
            node newNode = new node(value, null, temp);
            temp.next = newNode;
            return head;
        }

        node previous = temp.prev;
        node newNode = new node(value, temp, previous);
        previous.next = newNode;
        temp.prev = newNode;

        return head;
    }
    

    //-----REVERSE A DOUBLEY LINKED LIST----//
    static node reverseDLL(node head) {

        if (head == null || head.next == null)
            return head;

        node last = null;
        node current = head;
        while (current != null) {

            last = current.prev;
            current.prev = current.next;
            current.next = last;

            current = current.prev;
        }
        head = last.prev;
        return head;
    }
    
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 9 };
        node head = convert(arr);
        head  = reverseDLL(head);
        
        //Printing the linklist
        node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
