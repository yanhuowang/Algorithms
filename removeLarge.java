// remove nodes from a linked list having larger value than val
public ListNode removeLarge (ListNode head, int val) {
    ListNode fakeHead = new ListNode(-1);
    fakeHead.next = head;
    ListNode cur = head;
    ListNode pre = fakeHead;
    while (cur != null) {
        if ( cur.val > val) {
            pre.next = cur.next;
        }
        else {
            pre = pre.next;
        }
        cur = cur.next;
    }
    return fakeHead.next;
}		
