package luoguString;

import java.util.Scanner;


/**
 * @author LZH.create
 * Date :2021.7.21
 * 字符串巧妙运用
 */
public class P1597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0 ;   // 1、2、3  分别表示  a、b、c
		int [] a = new int[101];   //用于记录输出
		
        Scanner sc = new Scanner(System.in) ;
//        String str = sc.nextLine() ;
         String str = sc.next() ;
        
       for(int i =0 ;i < str.length();i++) {
//        	 for(int i =0 ;str.charAt(i) !='\0';i++) {
       
        	if(str.charAt(i) >='a'&& str.charAt(i) <='z') {  // 判断左值是否为字母 
        		if(str.charAt(i+3)>='a'&&str.charAt(i+3)<='z')   a[str.charAt(i)-97] = a[str.charAt(i+3)-97] ;
        		else  num=str.charAt(i) - 97 ;  
        		//System.out.println(num);
        	}
        	if(str.charAt(i)>='0' && str.charAt(i)<='9') a[num] = str.charAt(i)-48 ;
        }
       System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}

}
