package leetcodePlan.Base;

import java.util.HashSet;
import java.util.Set;

public class P0142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public ListNode detectCycle(ListNode head) {
		 
		 ListNode pos = head ;
		 Set<ListNode> visited = new HashSet<ListNode>() ;
		 
		 while(pos != null) {
			 if(visited.contains(pos))   {
				 return pos ;
			 } else {
				 visited.add(pos) ;
			 }
			 pos = pos.next ;
		 } 
		 return null ;
	 }
	 
	 
	 
	 class ListNode {
		 
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		          }
		  }
}
