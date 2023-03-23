package TREE;

import java.util.LinkedList;
import java.util.Queue;

public class level_order_traversal {
    public static void main(String[] args) {

    }

    static void printCurrLevel(binaryTreeCreation.node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.println(root.data+" ");
        else if (level > 1) {
            printCurrLevel(root.left, level-1);
            printCurrLevel(root.right, level-1);
        }
    }


    static void printLevelOrderQueue(binaryTreeCreation.node root) {
        Queue<binaryTreeCreation.node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()) {
            binaryTreeCreation.node curr = q.poll();
            System.out.println(curr.data+" ");

            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }
}
