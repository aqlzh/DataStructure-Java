package leetcodePlan.Base;

import leetcodePlan.Base.P0082.ListNode;

public class P0024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head ;
        }

        ListNode newHead = head.next ;
        head.next = swapPairs(newHead.next) ;
        newHead.next = head ;
        return newHead ;
   }
    
    public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}

}
