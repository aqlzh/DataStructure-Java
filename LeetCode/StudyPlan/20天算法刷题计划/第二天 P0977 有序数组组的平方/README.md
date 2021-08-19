@[toc]

# [题目](https://leetcode-cn.com/problems/squares-of-a-sorted-array/)

- 给你一个按 非递减顺序 排序的整数数组 `nums`，返回 每个数字的平方 组成的新数组，要求也按 `非递减顺序` 排序。

 

示例 1：

```bash
输入：nums = [-4,-1,0,3,10]
输出：[0,1,9,16,100]
解释：平方后，数组变为 [16,1,0,9,100]
排序后，数组变为 [0,1,9,16,100]
```

示例 2：

```bash
输入：nums = [-7,-3,2,3,11]
输出：[4,9,9,49,121]
```

# 题解
## 解题思路
- **解法一** ：直接暴力模拟，平方然后八大排序
- **解法二**：因为上述解法，没有用到原始数组有序，采用`双指针`，分别从前后进行比较

## 代码实现
解法一：暴力模拟

```java
package leetcodePlan;

public class P0977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {-4,-1,0,3,10} ;
		
		int [] res = sortedSquares(nums) ;
		
		for(int i : res) {
			System.out.println(i +" ");
		}
        
	}
	

	    public static int[] sortedSquares(int[] nums) {
	        int [] temp = new int [nums.length] ;
	        for(int i =0 ; i < nums.length ;i++){
	            temp[i] = nums[i] * nums[i] ;
	        } 
	        
	        // 冒泡
	        for(int i =0 ; i < temp.length -1  ;i++){
	            for(int j = 0 ; j < temp.length - i -1 ; j++){
	                if(temp[j] > temp[j+1]){
	                    int t = temp[j] ;
	                    temp[j] = temp[j+1] ;
	                    temp[j+1] = t ;
	                }
	            }
	        }

	        return temp ;
	    }


}

```

解法二：双指针

```java
package leetcodePlan;

public class P0977_2 {

	
	 //  本例 采用 解法二： 双指针法
	public static void main(String[] args) {

	int [] nums = {-4,-1,0,3,10} ;
		
		int [] res = fun(nums) ;
		
		for(int i : res) {
			System.out.println(i +" ");
		}
	}

	public static int [] fun(int [] num) {
		
		int n = num.length ;
		int [] ans = new int[n] ;
      
       for(int i = 0 , j = n-1, pos = n-1 ; i <= j; ) {
    	   if(num[i]*num[i] > num[j]*num[j]) {
    		   ans[pos]=  num[i]*num[i]  ;
    		   ++i ;
    	   } else {
    		   ans[pos]=  num[j]*num[j]  ;
    		  --j ;
    	   }
    	   --pos ;
       }
        
        
		return ans ;
	}
	
}

```

