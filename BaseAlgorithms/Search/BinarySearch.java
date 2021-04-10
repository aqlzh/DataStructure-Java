package Algorithm;

/**
 * @author LZH.create
 *    非递归 二分查找算法
 */

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,4,5,7,8,9,10,22} ;
		
		System.out.println(binarySearch(arr,4));  // 返回数组下标

	}
	
	
    /**
     * 
     * @param arr    待查找的数组
     * @param target   需要查找的数
     * @return   返回对应 下标   没有则返回 -1
     */
    		
	public static int binarySearch(int [] arr,int target) {
		
		int left = 0 ;
		int right = arr.length - 1 ;
		
		while(left <= right) {  // 重要条件  说明需要继续查找
			int mid = (left + right) / 2 ;
			if(arr[mid] == target) {
				return mid ;
			} else if(arr[mid] > target) {
				right = mid - 1 ;
			}else {
				left = mid + 1 ;
			}
		}
		return 0 ;
	}

}
