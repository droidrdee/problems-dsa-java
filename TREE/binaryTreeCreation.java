package TREE;
import java.util.Scanner;

import static TREE.height_size.*;
import static TREE.level_order_traversal.printCurrLevel;
import static TREE.traversal.*;
import static TREE.level_order_traversal.*;

public class binaryTreeCreation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        node root = createtree();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();

        int h = height(root);
        System.out.println("Height of tree is : "+h);

        int size = size(root);
        System.out.println("Size of tree is : "+size);

        // for level order traversal

        for (int i = 0; i < h; i++) {
            printCurrLevel(root, i);
        }
        System.out.println();

        printLevelOrderQueue(root);
    }







    static node createtree(){
        node root = null;
        System.out.print("Enter data : ");
        int data = sc.nextInt();

        if(data == -1)
            return null;
        root = new node(data);
        System.out.println("Enter left of "+data+" - ");
        root.left = createtree();

        System.out.print("Enter right of "+data+" - ");
        root.right = createtree();

        return root;
    }
    static class node {
        int data;
        node left;
        node right;
        public node(int data) {
            this.data = data;
        }
    }


    // traversal


}
