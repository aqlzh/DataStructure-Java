package luoguString;

import java.util.Scanner;

/**
  * @author LZH.create
  *Date 2021.4.3 
    *    �ؼ�Ϊ ʶ������� ��������
     *     ע�������м�� 0 �Ĵ���  ����  true  fasle   
  */
public class P1553 {
	
	
//	  public static void main(String[] args) {
//	        Scanner in = new Scanner(System.in);
//	        String str = in.nextLine();
//	        String s[] = new String[2] ;
//	        if(str.indexOf('.')!=-1) { // ʶ��С��
//	        	s = str.split("\\.");
//	        	turn(s[0]);
//	        	System.out.print(".");
//	        	turn(s[1]);
//	        }else if(str.indexOf('/')!=-1) { // ʶ�����
//	        	s = str.split("/");
//	        	turn(s[0]);
//	        	System.out.print("/");
//	        	turn(s[1]);
//	        }else if(str.indexOf('%')!=-1) { // ʶ��ٷ���
//	        	s = str.split("%");
//	        	turn(s[0]);
//	        	System.out.print("%");
//	        }else { // ʶ������
//	        	turn(str);
//	        }
//	    }
//	    // �ַ�����
//	    public static void turn(String str) {
//	    	boolean flag1 = false; // ��־ǰ������0
//	    	boolean flag2 = false; // ��־��������0
//	    	String s = "";
//	    	// ȥ��ǰ������0
//	    	for(int i=0;i<=str.length()-1;i++) { 
//	    		if(!flag1 && str.charAt(i)=='0') {
//	    			continue;
//	    		}
//	    		flag1 = true;
//	    		s += str.charAt(i); // ��ʾ��ȥ��ǰ��0���ַ���
//	        }
//	    	// ȥ����������0
//	    	for(int i=s.length()-1;i>=0;i--) {
//	    		if(!flag2 && s.charAt(i)=='0') {
//	    			continue;
//	    		}
//	    		flag2 = true;
//				System.out.printf("%s",s.charAt(i));
//	        }
//	    	if(str == "" || s == "") {
//	    		System.out.print("0");
//	    		return ;
//	    	}
//	    }
	
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		String str = sc.nextLine() ;
		
		String a [] = new String[2] ;   // �����Ϊ������   ���� split() ����
		
		if(str.indexOf('.') != -1) {   // С�� 
	        a = str.split("\\.")   ;   // ע��  ����Ϊ   \ \
	        turn(a[0]) ;
	        System.out.print(".");
	        turn(a[1]) ;
		}else if(str.indexOf('/') != -1)     // indexOf()  �ڲ���  ' '    
		{    // ����
			// ����֮ǰ 
			a = str.split("/") ;
			turn(a[0]) ;
			System.out.print("/");
			turn(a[1]) ;
 		}
		 else if(str.indexOf('%') != -1) {   // �ٷ���
			a = str.split("%") ;
			turn(a[0]) ;
			System.out.print("%");
//			turn(a[1]) ;
		} else {
			turn(str) ;
		}
		
	}
	
	// ��װ ��ת  �ַ�������
	public  static void turn(String str) {
		Boolean flag1 = false ;
		Boolean flag2 = false ;
		
		String s  = "" ;
		
		// ǰ��� 0
		for(int i = 0 ; i < str.length() ; i++) {
			if(!flag1 && str.charAt(i) == '0') {    // һ��Ϊ '0'  ������ 0
 				continue ;
			}
			flag1 = true ;  // 10001  �����м�� 0
			s += str.charAt(i)  ;
		}
		
		// �����  0   ע���  s  ���������  str
		for(int i = s.length() -1 ; i>=0 ; i--) {      //   i>= 0 ��  �Ⱥ�
			if(!flag2 && s.charAt(i) == '0') {
				continue ;
			}
			flag2 = true ;  // 10100  ȥ������� 0
			System.out.printf("%s",s.charAt(i));
		}
		
		if(str == "" || s == "") {
    		System.out.print("0");
    		return ;
    	}	
	} 

}
