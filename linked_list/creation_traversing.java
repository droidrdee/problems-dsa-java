package linked_list;

public class creation_traversing {
    public static void main(String[] args) {
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node n4 = new node(40);


        node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        printll(head);
    }

    static void printll(node head) {
        node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static class node {
        int data;
        node next;
        node( int data ){
            this.data = data;
        }
    }
}
