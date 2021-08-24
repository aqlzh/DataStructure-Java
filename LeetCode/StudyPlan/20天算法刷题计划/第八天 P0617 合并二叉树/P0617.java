package leetcodePlan;

import java.util.Scanner;

public class P0617 {

	public static void main(String[] args) {
		 TreeNode root1 = null;
		 TreeNode root2 = null;
		 System.out.println("输入先序遍历序列进行创建二叉树1");
		 createTree(root1) ;
		 //InOrder(root1) ;
//		 System.out.println("输入先序遍历序列进行创建二叉树2");
//		 createTree(root2) ;
//		 
		 
		 
	}
	


    /**
     * 
     * 	   public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
     */
	
	   public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

		   if(root1 == null) {
			   return root2 ;
		   }
		   
		   if(root2 == null) {
			   return root1 ;
		   }
		   
		   TreeNode merged = new TreeNode(root1.val+root2.val) ;
		   merged.left = mergeTrees(root1.left,root2.left) ;
		   merged.right = mergeTrees(root1.right,root2.right) ;
		   
		   
		    return merged ;
	    }
	   
	   
	   //  注： 因为 char  创建二叉树  个位数
	   public static void createTree(TreeNode root) {
		   
		   TreeNode root1 = new TreeNode(0) ;
		   Scanner sc = new Scanner(System.in) ;
		   
		   String str = sc.next() ;
		   
		   for(int i = 0 ; i < str.length() ; i++) {
			   if(str.charAt(i) == '#') {
				   root1 = null ;
			   } else {
				   
				   // a 97   A 65
				   
 			        root1.val = (int)(str.charAt(i))-48 ;

				   createTree(root1.left) ;
				   createTree(root1.right) ;
				   
			   }
			   
		   }
		   InOrder(root1) ;
	   }
	   
	   
	   // 利用栈 中序遍历
	   public static void InOrder(TreeNode root)
	   {

		   TreeNode [] ptr = new  TreeNode[20] ;
		   int top=-1;
		   
	   	while(root != null|| top!=-1){
	   		while(root !=null){
	   			ptr[++top]=root;
	   			root = root.left ;
	   		
	   		}
	   		if(top!=-1){
	   			root=ptr[top--];
	   				System.out.println(root.val);
	   			 root = root.right ;
	   		
	   		}
	   	
	   	}
	   	
	  

	   }
	     

	
}

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
