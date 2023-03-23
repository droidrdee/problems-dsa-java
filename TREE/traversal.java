package TREE;

public class traversal {
    public static void main(String[] args) {
//        binaryTree.node root = createtree();
//        inorder(root);
//        System.out.println();
////        preorder(root);
////        System.out.println();
////        postorder(root);
//        int heig = height(root);
//        System.out.println("Height of tree is : "+ heig);
    }

    static void inorder(binaryTreeCreation.node root) {
        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static void preorder(binaryTreeCreation.node root ) {
        if (root ==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(binaryTreeCreation.node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }
}
