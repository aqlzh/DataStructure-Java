package luoguTest;

public class StringFormat {
	  public static void main(String[] args){
		  
		    String str=null;  
		    str=String.format("Hi,%s", "С��");  
		    System.out.println(str);  
		    str=String.format("Hi,%s %s %s", "С��","�Ǹ�","��˧��");            
		    System.out.println(str);                           
		    System.out.printf("��ĸc�Ĵ�д�ǣ�%c %n", 'C');  
		   // System.out.printf("��������ǣ�%b %n", "С��".equal("˧��"));  
		    System.out.printf("100��һ���ǣ�%d %n", 100/2);  
		    System.out.printf("100��16�������ǣ�%x %n", 100);  
		    System.out.printf("100��8�������ǣ�%o %n", 100);  
		    System.out.printf("50Ԫ�����8.5�ۿ��ǣ�%f Ԫ%n", 50*0.85);  
		    System.out.printf("����۸��16�������ǣ�%a %n", 50*0.85);  
		    System.out.printf("����۸��ָ����ʾ��%e %n", 50*0.85);  
		    System.out.printf("����۸��ָ���͸���������ĳ��Ƚ϶̵��ǣ�%g %n", 50*0.85);  
		    System.out.printf("������ۿ���%d%% %n", 85);  
		    System.out.printf("��ĸA��ɢ�����ǣ�%h %n", 'A');  
		  
	  }

}
