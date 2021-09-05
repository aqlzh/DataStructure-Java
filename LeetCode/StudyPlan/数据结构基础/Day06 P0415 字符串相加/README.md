@[toc]
# [题目](https://leetcode-cn.com/problems/add-strings/)

- 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。

 提示：

num1 和num2 的长度都小于 5100
num1 和num2 都只包含数字 0-9
num1 和num2 都不包含任何前导零
你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式

# 题解
- 设置进位   `carry`   ，双指针依次相加  

![在这里插入图片描述](https://img-blog.csdnimg.cn/2f366883efd04c2788a4f314787a54e3.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_13,color_FFFFFF,t_70,g_se,x_16)
- 注意最后依次进位。

```java
package leetcodePlan.Base;

public class P0415 {

	
	//   双指针 模拟人工加法
	public static void main(String[] args) {

	    String num1 ="12" ;
	    String num2 = "12" ;
	    System.out.println(fun(num1,num2));
	}
	
	public static String fun(String num1, String num2) {
		StringBuilder res = new StringBuilder("") ;
		// 记录双指针 以及进位 
		int i = num1.length() - 1 , j = num2.length() - 1  , carry = 0 ;
		
		while(i >= 0 || j >= 0 ) {    // 只要一个还有值
			int n1 = i >=0  ? num1.charAt(i) - '0' : 0 ;
			int n2 = j >=0  ? num2.charAt(j) - '0' : 0 ;
			
			int tmp = n1+n2 + carry ;
			carry = tmp/10 ;
			res.append(tmp%10) ;
			i-- ; 
			j-- ;
		}
		if(carry == 1) res.append(1) ; //   注意考虑最后一位进位
		return  res.reverse().toString() ;
	}

}

```

