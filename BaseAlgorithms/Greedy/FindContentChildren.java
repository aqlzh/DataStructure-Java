package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LZH.create
 *    ̰���㷨֮�����������
  */
public class FindContentChildren {

	public static void main(String[] args) {
       	int [] children = {1,2} ;  //  �ֱ��ʾ���ӵļ�����
       	int [] cookies = {1,2,3} ;
       	
		System.out.println(fun(children,cookies));
	}
	
	
	public static int fun(int [] children ,int [] cookies) {
		Arrays.sort(children);
		Arrays.sort(cookies);
		
		// ��������ָ��
		int child =  0 ;
		int cookie = 0 ;
		
		while(child < children.length && cookie < cookies.length) {
			if(children[child] < cookies[cookie++]) child++ ;
		}
		
		return child ;
	}
	
	

}
