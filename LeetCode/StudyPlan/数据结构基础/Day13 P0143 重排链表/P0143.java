package leetcodePlan.Base;

import java.awt.List;

import leetcodePlan.Base.P0024.ListNode;

public class P0143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void reorderList(ListNode head) {

    	if(head == null) {
    		return ;
    	}
    	//  ��ȡ�м�ڵ�
    	ListNode mid = findMid(head) ;
    	
    	// �м�ڵ�֮����з�ת
    	ListNode head2 = mid.next ;
    	mid.next = null ;
    	head2 = reverseList(head2) ;
    	
    	// �ϲ�
    	ListNode head1 = head ;
    	mergeList(head1,head2) ;
    
    }
    
    // LeetCode 876
    public static ListNode findMid(ListNode head) {
    	ListNode slow = head ;
    	ListNode fast = head ;
    	
    	while(fast.next != null && fast.next.next != null) {
    	    slow = slow.next ;
    	    fast = fast.next.next ;
    	}
    	return slow ;
    }
    
    
   
    // Leetcode  206   ��ת����
    
    public static ListNode reverseList(ListNode head) {
         
    	ListNode prev = null ;
    	ListNode cur = head ;
    	
    	while(cur != null) {
    		ListNode nextNode = cur.next ;
    		cur.next = prev ;
    		prev = cur ;
    		cur = nextNode;
    	}
         return prev ;
    	
    }
    
    public static void mergeList(ListNode head1,ListNode head2) {
    	ListNode next1 = null ;
    	ListNode next2 = null ;
    	
    	while(head1 != null && head2 != null) {
    		next1 = head1.next ;
    		next2 = head2.next ;
    		
    		head1.next = head2 ;
    		head1 = next1 ;
    		
    		head2.next = head1;
    		head2 = next2 ;
    	}
    }

    
    public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
}
