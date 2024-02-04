package linked_list;

import static linked_list.ListNode.createLinkedList;
import static linked_list.ListNode.printList;

public class OddEven {

    public static void main(String[] args) {
        int [] val = {1,2,3,4,5};
        ListNode listNode =createLinkedList(val);
        oddEvenList(listNode);
        printList(listNode);
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null ) {
            return null;
        }

            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;


            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;

        return head;
    }


}

//Leetcode 328