package PastExam;



/**
 * @author LZH.create
 *     Integer.MAX_VALUE ���ֵ
 */
public class B3_20 {

	public static void main(String[] args) {

		// sum  Ϊ�Լ���  ��� �����ʡ 
		int min=0;
		int sum=Integer.MAX_VALUE;
		
		// ����һ����  100 ��
		for(int i=1;i<=100;i++) {
		  if(100%i==0) {
		     if(100/i+i<sum) {
		     sum=100/i+i;
		     min=i;
		    }
		     
		 }else {
		     if(100/i+1+i<sum) {
		      sum=100/i+1+i;
		     min=i;
		   }
		}
		  
		}
		
		    System.out.println(min);
		}
	

}
