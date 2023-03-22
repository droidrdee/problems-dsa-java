package linked_list;
import static linked_list.creation_traversing.*;
public class reverse_ll {
    public static void main(String[] args) {

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
