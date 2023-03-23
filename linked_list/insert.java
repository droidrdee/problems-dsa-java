package linked_list;

public class insert {
    public static void main(String[] args) {

    }
    static void insert(int data, complete_ll.node head, int pos) {
        complete_ll.node toadd = new complete_ll.node(data);
        if (pos == 0 ){
            toadd.next = head;
            head = toadd;
            return;
        }

        complete_ll.node prev = head;
        for(int i = 1; i < pos-1; i++) {
            prev = prev.next;
        }
        toadd.next = prev.next;
        prev.next = toadd;
    }
}
