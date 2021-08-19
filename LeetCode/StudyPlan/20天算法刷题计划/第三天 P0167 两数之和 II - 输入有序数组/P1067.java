package leetcodePlan;

import java.util.Arrays;

public class P1067 {

	public static void main(String[] args) {

		int [] numbers = {2,7,11,15} ;
		int target = 9 ;
		
		System.out.println(Arrays.toString(fun1(numbers,target)));
		System.out.println(Arrays.toString(fun2(numbers,target)));
	}

	
	// 解法一 ： 二分查找
	
	  public static int[] fun1(int[] numbers, int target) {

		  for(int i =0 ; i < numbers.length ;i++) {
			  int index = Search(numbers, i +1  ,numbers.length - 1, target - numbers[i]) ;
			  
			  int [] temp = {i+1,index+1} ;
			  
			  return temp ;
		  }
		   return numbers ;
	    }
	  
	  
	  
	  // 解法二: 双指针
	   
	  public static int[] fun2(int[] numbers, int target) {
		  
		  int left = 0 ;
		  int right = numbers.length -1 ;
		  
		while(left < right) {
			  if(numbers[left] + numbers[right] == target) {
				  int [] tmp = {left + 1, right +1} ;
				  return tmp ;
			  }else if(numbers[left] + numbers[right] < target) {
				  left ++ ;
			  } else {
				  right -- ;
			  }
		}
	  
		  return numbers ;
	  }
	  
	  //  二分查找函数
	  public static int Search(int[] arr, int left ,int right ,int target) {
         
		   while(left < right) {
			   int mid = left + (right=left)/2 ;
			   if(arr[mid] == target) {
				   return  mid ;
			   } else if(arr[mid] < target) {
				   left = mid + 1;
			   } else {
				   right = mid -1 ;
			   }
			    
		   }
	      
		   return -1 ;
	    }
}
