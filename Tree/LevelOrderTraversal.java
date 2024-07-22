package DSA.Tree;
import java.util.*;


public class LevelOrderTraversal {
    public List<List<Integer>> LevelOrder(Node root) {
        List<List<Integer>> list = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();

        if (root == null)
            return list;

        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> subList = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }

                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }

                subList.add(q.poll().data);
            }
            list.add(subList);
        }
        return list;
    }
}