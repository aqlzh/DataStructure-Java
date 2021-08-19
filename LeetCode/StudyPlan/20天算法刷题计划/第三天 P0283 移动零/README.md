@[toc]
# 题目
[跳转链接](https://leetcode-cn.com/problems/move-zeroes/)

![在这里插入图片描述](https://img-blog.csdnimg.cn/cfd25842bf8d481d97fe7ea39f2a749c.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)

# 题解
- **解法一** ： 暴力解法，借助辅助数组（一开始设置为全零），扫描提供数组，非零复制到拷贝数组
- **解法二**：运用双指针（快慢指针），当 `Fast`指针所指不为零，交换 与`Flow` 指针的值，并且`Flow` 指针右移动


# 代码

```java
package leetcodePlan;

import java.util.Arrays;

/*
 * Date : 21.8.19
 * Author: LZH.create
 */

public class P0283 {

	public static void main(String[] args) {

		int [] arr = {0,1,0,3,12} ;
		fun1(arr) ;
		fun2(arr) ;
	}
		
    //  解法一 ：暴力解法  定义一个辅组数组
	
	public static void fun1(int [] arr) { 
		int [] tmp = new int [arr.length] ;
		
		int j = 0 ;
		for(int i =0 ; i < arr.length ; i++) {
			if(arr[i] != 0) {
				tmp[j] = arr[i] ;
				j++ ;
			}
		}
		System.out.println(Arrays.toString(tmp));
	}
	
	
	// 解法二 ：双指针法 （快慢指针）
	public static void fun2(int [] arr) { 
		
		
		int flow = 0 ;
		for(int fast =0 ; fast < arr.length ; fast++) {
		
			if(arr[fast] != 0) {
				int tmp = arr[fast] ;
				arr[fast] = arr[flow] ;
				arr[flow] = tmp ;
				flow++ ;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}

```

