package TREE;

import static TREE.binaryTreeCreation.*;
import static TREE.traversal.*;

public class heightOfBT {
    public static void main(String[] args) {
        binaryTreeCreation.node root = createtree();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
    static int height(node root) {
        if(root == null)
            return 0;

        return Math.max(height(root.left), height(root.right))+1;
    }
}
