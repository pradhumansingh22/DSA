package DSA.Tree;

import java.util.*;

public class DFS_TreeTraversals {
    static void PreOrder(Node root) {
        if (root == null) {
            return;
        }

        //Print the data
        System.out.println(root.data);

        //Visit the left most sub-tree
        PreOrder(root.left);

        //Visit the right most sub-tree
        PreOrder(root.right);
    }

    static List<Integer> IterativePreOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            root = st.pop();

            if (root.right != null) {
                st.push(root.right);
            }

            if (root.left != null) {
                st.push(root.left);
            }
            
            list.add(root.data);
           
        }

        return list;
    }


    static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        //Visit the left most sub-tree
        InOrder(root.left);

        //Visit the left most sub-tree
        System.out.println(root.data);

        //Visit the right most sub-tree
        InOrder(root.right);
    }

    static List<Integer> IterativeInOrder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        Stack<Node> st = new Stack<>();

        Node node = root;
        while (true) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } else {
                if (st.isEmpty()) {
                    break;
                }

                node = st.pop();
                list.add(node.data);
                node = node.right;
            }
        }
        return list;

    }

    
    static void PostOrder(Node root) {
        if (root == null) {
            return;
        }
        //Visit the left most sub-tree
        PostOrder(root.left);

        //Visit the right most sub-tree
        PostOrder(root.right);

        //Visit the left most sub-tree
        System.out.println(root.data);

    }

    static List<Integer> IterativePostOrder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);

        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.push(root);
            if (root.left != null) {
                st1.push(root.left);
            }
            if (root.right != null) {
                st1.push(root.right);
            }
        }

        while (!st2.isEmpty()) {
            list.add(st2.pop().data);
        }
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        
        PreOrder(root);
        System.out.println();
        System.out.println(IterativePreOrder(root));
        InOrder(root);
        System.out.println();
        System.out.println(IterativeInOrder(root));
        PostOrder(root);
        System.out.println();
        System.out.println(IterativePostOrder(root));
    }
}
