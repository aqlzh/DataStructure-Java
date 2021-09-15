package leetcodePlan.Base;

import java.util.HashSet;
import java.util.Set;

public class P0160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<ListNode>() ;
    	ListNode tmp = headA ;
    	while(tmp != null) {
    		visited.add(tmp) ;
    		tmp=tmp.next ;
    	}
    	
    	tmp = headB;
    	while(tmp != null) {
    		if(visited.contains(tmp)) {
    			return tmp ;
    		}
    		tmp = tmp.next ;
    	}
    	return null ;
    }
    
    
    public ListNode fun(ListNode headA, ListNode headB) {
    	if(headA == null || headB ==null) {
    		return null ;
    	}
    	
    	ListNode pA = headA, pB = headB ;
    	while(pA != pB) {
    		pA = pA == null ? headB : pA.next ;
    		pB = pB == null ? headA : pB.next ;
    	}
    	
    	return pA ;
    }
    
     public class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode(int x) {
    	          val = x;
    	          next = null;
    	      }
    	  }

}
