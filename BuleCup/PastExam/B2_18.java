package PastExam;

/**
 * @author LZH.create
 *   �ھŽ�  ���ű� �ڶ��� �������
 *   
 *    ��� �� ��Զ�ķ��� ���� ���ᳬ���뾶
 */
public class B2_18 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int r = 1000 ;
       int sum = 0 ;
       
       for(int i = 0 ; i < r ;i++) {
    	   for(int j = 0 ; j < r ;j++) {
    		   int a = i +1 ;
    		   int b = j +1 ;
    		   
    		   if(a*a + b*b <= r*r) sum++ ;
    	   }
       }
       System.out.println(sum*4);
	}

}
