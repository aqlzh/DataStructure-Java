package BaseFunction;


/**
 * @author LZH.create
 *   �����ͳ���㷨   --> ͳ��һ�����ֵ� �������� ���ֵĴ���
 */
public class RandomCount {
	public static void main(String [] args) {
		
		
		
        long num = 12345678900l;
        String strNum = String.valueOf(num);
        numberCount(strNum);
    }

    private static void numberCount(String strNum) {
        int[] c = new int[10];  //��ʼ����Ϊ0     0 ~9 
        
        for (int i = 0; i < strNum.length(); i++) {
            char cTemp = strNum.charAt(i); //����±�i���ַ�      //���ֵ�ASCII��ΧΪ��48~57
            int index = cTemp - 48;    //����ת��  //����strNum�ж������֣�����index��Χ��0~9
            c[index]++;     //��Ӧ�±����������
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + "����" + c[i] + "��");
        }
    }

//		int [] r = {2,3,2,4,5,6,8,9,4,3,3,5,7,3,2} ;
//		int [] res = new int[r.length] ;
//		int num = 0 ;
//		
//		for(int i = 0 ; i < r.length  ;i++) {
//			res[num] = r[i] ;
//			for(int j = 0 ;j <= num ;j++) {
//				if(res[j] != r[i]) {
//					num++ ;
//					res[num] = r[i]  ;
//					
//							
//				}
//			}
//			
//    
//			 for(int x : res) {
//				 System.out.println(x);
//			 }
//			
	
	

}
