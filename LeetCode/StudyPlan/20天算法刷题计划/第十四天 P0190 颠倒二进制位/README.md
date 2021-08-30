@[toc]

# [题目](https://leetcode-cn.com/problems/reverse-bits/)

- 颠倒给定的 32 位无符号整数的二进制位。


提示：

- 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 2 中，输入表示有符号整数 -3，输出表示有符号整数 -1073741825。
 
- 进阶:  如果多次调用这个函数，你将如何优化你的算法？

 

示例 1：

```bash
输入: 00000010100101000001111010011100
输出: 00111001011110000010100101000000
解释: 输入的二进制串 00000010100101000001111010011100 表示无符号整数 43261596，
     因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。
```

# 题解

## 解法一（位运算）
- 将 n 视作一个长为 32 的二进制串，从低位（取第一位  `n&1` ）往高位枚举 n 的每一位，将其倒序添加到翻转结果 rev 中。

- 代码实现中，每枚举一位就将 n 右移一位( `n>>> 1`)，这样当前 n 的最低位就是我们要枚举的比特位。当 n 为 0 时即可结束循环。

> **注意**： 中，没有无符号整数类型，因此对 n 的右移操作应使用逻辑右移。
> 

> 算术右移 >> ：舍弃最低位，高位用符号位填补；
>  逻辑右移 >>> ：舍弃最低位，高位用 0 填补。

```java
public class Solution {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
}
```
解析：
-  `<< ( 31 - i)`  为向左移，因为是逆序 
-  `rev | =`  为类似于递加

 
## 解法二 （回文数）
- 有点类似于回文数  逆序，将十进制的 乘10以及模改成 2 即可，当然是数不超范围情况下

```java
	public static Boolean hws(long n) {
		long num = 0 ;
		long y = n ;
		
		while(y!=0) {
			num = num*10+y%10 ;
			y/=10;
		}
		
		if(num == n) return true ;
		else return false ;
	}

```

## 解法三 （分治法）

- 若要翻转一个二进制串，可以将其均分成左右两部分，对每部分递归执行翻转操作，然后将左半部分拼在右半部分的后面，即完成了翻转。

- 由于左右两部分的计算方式是相似的，利用`位掩码`和`位移`运算，我们可以自底向上地完成这一分治流程

![在这里插入图片描述](https://img-blog.csdnimg.cn/a2b916f743d44e33b885abbe487b5ee5.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_18,color_FFFFFF,t_70,g_se,x_16)

```java
public class Solution {
    private static final int M1 = 0x55555555; // 01010101010101010101010101010101
    private static final int M2 = 0x33333333; // 00110011001100110011001100110011
    private static final int M4 = 0x0f0f0f0f; // 00001111000011110000111100001111
    private static final int M8 = 0x00ff00ff; // 00000000111111110000000011111111

    public int reverseBits(int n) {
        n = n >>> 1 & M1 | (n & M1) << 1;
        n = n >>> 2 & M2 | (n & M2) << 2;
        n = n >>> 4 & M4 | (n & M4) << 4;
        n = n >>> 8 & M8 | (n & M8) << 8;
        return n >>> 16 | n << 16;
    }
}

 
```

==**详细讲解**==


```go
32位无符号整数，如 1111 1111 1111 1111 1111 1111 1111 1111 
表示成16进制        f    f    f    f    f    f    f   f
一个16进制的f代表二进制的4位
ffff ffff右移16位，变成 0000 ffff
ffff ffff左移16位，变成 ffff 0000
它们俩相或，就可以完成低16位与高16位的交换
```

之后的每次分治，都要先与上一个掩码，再进行交换

```c
class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        n = (n >> 16) | (n << 16); //低16位与高16位交换
        n = ((n & 0xff00ff00) >> 8) | ((n & 0x00ff00ff) << 8); //每16位中低8位和高8位交换; 1111是f
        n = ((n & 0xf0f0f0f0) >> 4) | ((n & 0x0f0f0f0f) << 4); //每8位中低4位和高4位交换;
        n = ((n & 0xcccccccc) >> 2) | ((n & 0x33333333) << 2); //每4位中低2位和高2位交换; 1100是c,0011是3
        n = ((n & 0xaaaaaaaa) >> 1) | ((n & 0x55555555) << 1); //每2位中低1位和高1位交换; 1010是a,0101是5
        return n;
    }
};
```

## 解法四（接口法）

```java
public class Solution {
    public int reverseBits(int n) {
         return Integer.reverse(n);
    }
}
```

- 不妨透露下，`Integer.reverse()`  API 内部源码就是解法三的位运算分治法

![在这里插入图片描述](https://img-blog.csdnimg.cn/c7eda62768624002a2f0167f497035ac.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

