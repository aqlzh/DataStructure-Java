@[toc]
# 基本API 调用
## Arrays.sort
- `Arrays.sort(arr);`     排序

## toUpperCase()
 
-  将小写字母转换为  大写字母

```java
   Scanner sc = new Scanner (System.in) ;
   String  a = sc.next() ;
   System.out.println(a.toUpperCase());

```

## 将数字转换为字符串（互逆）
- 将数字转换为  字符串 ==（错误）==

```java
String s = String.valueOf(a)

```

- 将数字ASCII   转换为 字符串  ==（运用强制转换）==

```java
package luoguTest;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in) ; 
		String  a = sc.next() ;
		int temp = (a.charAt(0)-32)  ;
		char s  = (char) temp ;
		System.out.println(s);
	}

}
```
##  charAt（）
- `charAt()` 方法用于返回指定索引处的字符。索引范围为从 0 到 `length() - 1`。

## String.format()   格式化输出
[参考链接](https://blog.csdn.net/anita9999/article/details/82346552)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210310095008519.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210310095034168.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)

==拓展==：

```bash
System.out.format("%d %d",e,f);
```

## Comparable
[参考链接](https://www.cnblogs.com/Mrfanl/p/11344613.html)


## s.charAt() 
[参考链接](https://www.runoob.com/java/java-string-charat.html)

返回类型为字符

## subString()
[参考链接](https://www.runoob.com/java/java-string-substring.html)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210312172255201.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)

## 取整方法
方法一：向上取整`Math.ceil()`


方法二：向下取整`Math.floor()`;


方法三：四舍五入`Math.round()`;


# 集合
`List<Object> list = Arrays.asList(arr);`   将数组转换为  list 

