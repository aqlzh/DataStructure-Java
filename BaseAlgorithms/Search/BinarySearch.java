package Algorithm;

/**
 * @author LZH.create
 *    �ǵݹ� ���ֲ����㷨
 */

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,4,5,7,8,9,10,22} ;
		
		System.out.println(binarySearch(arr,4));  // ���������±�

	}
	
	
    /**
     * 
     * @param arr    �����ҵ�����
     * @param target   ��Ҫ���ҵ���
     * @return   ���ض�Ӧ �±�   û���򷵻� -1
     */
    		
	public static int binarySearch(int [] arr,int target) {
		
		int left = 0 ;
		int right = arr.length - 1 ;
		
		while(left <= right) {  // ��Ҫ����  ˵����Ҫ��������
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
