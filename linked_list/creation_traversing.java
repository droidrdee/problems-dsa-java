package linked_list;
import java.util.Scanner;

//import static linked_list.reverse_ll.*;

public class creation_traversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node n4 = new node(40);


        node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        insert(50,head,5);
        insert(60,head,6);
        insert(70,head,7);
        insert(80,head,8);
        insert(90,head,9);

        printll(head);

        System.out.println("enter position of element you want to delete : ");
        int pos = sc.nextInt();

        delet(head, pos);
        printll(head);


        printll(head);
        System.out.println();

        node rev = reverseIteration(head);

        printll(rev);
    }

    static void printll(node head) {
        node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    static void insert(int data, node head, int pos) {
        node toadd = new node(data);
        if (pos == 0 ){
            toadd.next = head;
            head = toadd;
            return;
        }

        node prev = head;
        for(int i = 1; i < pos-1; i++) {
            prev = prev.next;
        }
        toadd.next = prev.next;
        prev.next = toadd;
    }

    static void delet(node head, int position) {
        if (position == 0) {
            head = head.next;
            return;
        }
        node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
    static class node {
        int data;
        node next;
        node( int data ){
            this.data = data;
        }
    }




    public static node reverseIteration(node head) {
        node curr = head;
        node prev = null;

        while (curr != null) {
            node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
