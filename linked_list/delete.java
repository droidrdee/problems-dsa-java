package linked_list;

public class delete {
    public static void main(String[] args) {
        // call the function delete in complete class
    }

    static void delete(complete_ll.node head, int position) {
        if (position == 0) {
            head = head.next;
            return;
        }
        complete_ll.node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

}
