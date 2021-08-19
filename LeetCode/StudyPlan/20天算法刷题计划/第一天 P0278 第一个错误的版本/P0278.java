package leetcodePlan;


/*
 * leetcode  ��������˼��
 */
		
public class P0278 {

	public static void main(String[] args) {
		// ��������
       int [] nums = {1,3,6,2,9,12} ;
       
       quickSort(nums, 0, nums.length - 1);
       System.out.println("�����:");
       for (int i : nums) {
           System.out.print(i + " ");
       }
	}
	
	private static void quickSort(int [] arr,int low ,int high) {
		if(low < high) {
			// ��׼ ����ȷ����
			int index = getIndex(arr,low,high) ;
			 quickSort(arr, low, index - 1);
             quickSort(arr, index + 1, high);
			
		}
	}
	
	private static int getIndex(int [] arr,int low ,int high) {
		int temp = arr[low] ;
		while(low < high && arr[high] >=temp ) high -- ;
		arr[low] = arr[high] ;
		
		while(low < high && arr[low] <= temp ) low++ ;
		arr[high] = arr[low] ;
		
		 arr[low] = temp;
		return low ;
	}

}


//public class Solution extends VersionControl {
//    //   ��Ϊ������  =>  ���ֲ���   => ��ϰ��������
//    public int firstBadVersion(int n) {
//        int left= 1 ;
//        int right = n ;
//        while(left < right){
//              int mid = left + (right-left)/2 ;
//              if(isBadVersion(mid)){
//                  right = mid ;
//              } else {
//                  left = mid+1 ;
//              }
//        }
//      
//        return left ; 
//    }