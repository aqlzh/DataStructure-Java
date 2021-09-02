package leetcodePlan.Base;

public class P0240 {

	public static void main(String[] args) {

		int [][] matrix = 
	   {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}} ; 
       
		System.out.println(fun(matrix,5));
			 
	}
	
	
    public static  boolean fun(int[][] matrix, int target) {
        
    	int i =  matrix.length-1 , j = 0 ;
    	int root = matrix[i][j] ;
    	
    	while(root > target && i>=0)   root = matrix[i--][j] ;
    	while(root < target)   root = matrix[i][j++] ;
    
    	if(root == target) {
    		return true ;
    	}else {
    		return false ;
    	}
    	
    	
    }

}
