@[toc]
# [题目](https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/)
- 给定一个已按照 `升序排列`  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。

- 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。

- 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。

 
示例 1：

```bash
输入：numbers = [2,7,11,15], target = 9
输出：[1,2]
解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
```

示例 2：

```bash
输入：numbers = [2,3,4], target = 6
输出：[1,3]
```


# 题解
## 题目大意：
- 在升序数组中找到两个值等于目标值
## 解题思路
- **解法一** ：`二分查找`，依次区元素 `num[i]`，剩余的元素运用二分查找 `target - num[i]` 
- **解法二**：`双指针法`，在数组左右各放置指针，两个指针元素值相加，若大于目标值右指针左移，反之左指针右移。
## 实现代码

```java
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

```

