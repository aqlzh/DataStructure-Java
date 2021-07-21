package luoguString;

import java.util.Scanner;


/**
 * @author LZH.create
 * Date :2021.7.21
 * �ַ�����������
 */
public class P1597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0 ;   // 1��2��3  �ֱ��ʾ  a��b��c
		int [] a = new int[101];   //���ڼ�¼���
		
        Scanner sc = new Scanner(System.in) ;
//        String str = sc.nextLine() ;
         String str = sc.next() ;
        
       for(int i =0 ;i < str.length();i++) {
//        	 for(int i =0 ;str.charAt(i) !='\0';i++) {
       
        	if(str.charAt(i) >='a'&& str.charAt(i) <='z') {  // �ж���ֵ�Ƿ�Ϊ��ĸ 
        		if(str.charAt(i+3)>='a'&&str.charAt(i+3)<='z')   a[str.charAt(i)-97] = a[str.charAt(i+3)-97] ;
        		else  num=str.charAt(i) - 97 ;  
        		//System.out.println(num);
        	}
        	if(str.charAt(i)>='0' && str.charAt(i)<='9') a[num] = str.charAt(i)-48 ;
        }
       System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}

}



//#include<bits/stdc++.h>
//		using namespace std;
//		char x[10001];    //使用字符串
//		int a[101]={0};    //初始值为0
//		int main()
//		{
//		int t;    //1表示a，2表示b，3表示c
//		gets(x);    //获取字符串，也就是表达式
//		for (int i=0;x[i]!='\0';i++){    //循环，简单的模拟
//		if (x[i]>='a'&&x[i]<='z'){    //判断是否为字母 
//		if (x[i+3]>='a'&&x[i+3]<='z') a[x[i]-97]=a[x[i+3]-97];    //再次判断这个变量赋的值是否为一个变量
//		else t=x[i]-97;    //如果赋的只是一位数字，则t更新为变量的位置
//		}
//		if (x[i]>='0'&&x[i]<='9') a[t]=x[i]-48;    //如果是数字，将上一次判断的位置的值更新为相应数字
//		}
//		cout<<a[0]<<" ";    //一次输出所代表的值
//		cout<<a[1]<<" ";
//		cout<<a[2]<<" ";
//		}
