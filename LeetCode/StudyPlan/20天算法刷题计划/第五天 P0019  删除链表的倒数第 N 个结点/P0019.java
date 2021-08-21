package leetcodePlan;
//  思考 ： 关于指针  arr[i].next   会报空指针

   //  测试代码     
public class P0019 {

	public static void main(String[] args) {

		  int[] arr = new int[]{1, 2, 3, 4, 5}; 
	      ListNodes head = new ListNodes(arr,arr.length);
	      P0019 solution = new P0019();
	      ListNodes res = solution.removeNthFromEnd(head,2);
	      System.out.println(res);
	}
	
	
	//  双指针
	   public ListNodes removeNthFromEnd(ListNodes head, int n) {
		   int[] arr = new int[]{1, 2, 3, 4, 5}; 
	        ListNodes dummy = new ListNodes(arr,0);
	        ListNodes first = head;
	        ListNodes second = dummy;
	        for (int i = 0; i < n+1; ++i) {
	            first = first.next;
	        }
	        while (first != null) {
	            first = first.next;
	            second = second.next;
	        }
	        second.next = second.next.next;
	        ListNodes ans = dummy.next;
	        return ans;

	    }

}

class ListNodes {
    int val;
    int length ;
    ListNodes next;
    ListNodes(int x,int l) {
        val = x ;
        length = l ; 
    }

    
    
    public ListNodes(int[] nums,int length) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("arr can not be empty");
        }
        this.val = nums[0];
        ListNodes curr = this;
        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNodes(nums[i],i);
            curr = curr.next;
        }
    }



	@Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        ListNodes cur = this;
        while (cur != null) {
            s.append(cur.val);
            s.append(" -> ");
            cur = cur.next;
        }
        s.append("NULL");
        return s.toString();
    }
}
