@[toc]

# 题目
- 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。

 
示例:

```css
输入: [1,2,3,4]
输出: [24,12,8,6]
```
# 题解
- 解法一：当然使用除法，简洁高效
- 解法二：利用乘积 = 左边乘积（前缀） * 右边乘积 （后缀）

![在这里插入图片描述](https://img-blog.csdnimg.cn/91a7edbe1696442b8a31a5af879b013a.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)
**分界线**
![在这里插入图片描述](https://img-blog.csdnimg.cn/da25ec31f61546268c4bb56484577940.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_16,color_FFFFFF,t_70,g_se,x_16)

```java
	int [] res = new int[nums.length] ;
		int k = 1 ;
		for(int i =0 ; i < res.length ;i++) {
			res[i] = k ;
			k *= nums[i] ;  // 前缀之积
		}
		k = 1 ; // 初始化
		for(int i = res.length - 1; i >= 0 ;i--) {
			res[i] *= k ;
			k*= nums[i] ;
		}
		return res ;
```

