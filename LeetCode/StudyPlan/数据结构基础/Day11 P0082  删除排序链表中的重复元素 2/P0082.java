package leetcodePlan.Base;

public class P0082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	//  �ⷨһ���ݹ�
    public static ListNode deleteDuplicates(ListNode head) {

    	if(head == null || head.next == null)    return head ;
    	
    	if(head.next.val != head.val) {
    		head.next =  deleteDuplicates(head.next) ;
    	} else {
    		ListNode tmp = head.next ;
    		while(tmp != null && head.val == tmp.val ) tmp = tmp.next ;
    		return deleteDuplicates(tmp) ;
    	}
    	
    	return head ;
    }
    
    
    // �ⷨ�� �� һ�α���
    
    public static ListNode fun(ListNode head) {
    	
    	if(head == null || head.next == null) return head ;
    	//   ά��һ������Ľڵ�   �ƽڵ�
    	ListNode  tmp = new ListNode() ;
    	tmp.next = head ;
    	
    	ListNode pre = tmp ;
    	ListNode cur = head ;
    	
    	
    	while(cur != null) {
    		while(cur.next != null && cur.next.val == cur.val ) cur = cur.next ;
    		
    		if(pre.next == cur) {
    			pre=pre.next ;
    		} else {
    			pre.next = cur.next ;
    			cur=cur.next ;
    		}
    		
    	}
    	
    	return tmp.next ;
    }
    
    
     public static class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode() {}
    	      ListNode(int val) { this.val = val; }
    	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     }
}
