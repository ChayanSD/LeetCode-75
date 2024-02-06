package linked_list;

import static linked_list.ListNode.printList;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        int[] head = {1, 3, 4, 7, 1, 2, 6};
        ListNode listNode = ListNode.createLinkedList(head);
        deleteMiddle(listNode);
        printList(listNode);
    }

    //fast and slow pointer approach.
    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head.next.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;

    }
}
