package PastExam;

/**
 * @author LZH.create
 *     ���ű� ���� ��ʮ�� 2019
 *  Date : 21.4.17   
 *     ���� D  ���ķֽ�   
 */
public class B4_19 {

	
	public static void main(String[] args) {

		int count = 0 ;
        for(int i = 1 ; i <= 2019 ; i++) {		
        	//if(i+"".indexOf("2") != -1 || i+"".indexOf("4") != -1) break ;        // ע�ⲻ�� break �� continue
        	if((i+"").indexOf("2") != -1 || (i+"").indexOf("4") != -1) continue ; 
            for(int j = i+1 ; j <= 2019 ;j++) {		
            	if((j+"").indexOf("2") != -1 || (j+"").indexOf("4") != -1 || i ==j) continue ;
            	int k = 2019 - j -i ;
            	if((k+"").indexOf("2") == -1 && (k+"").indexOf("4") == -1 && i !=j && i !=k && k !=j && k>0) count++ ;
            }
        	
        }
        
        System.out.println(count/3);
        another() ;
	}
	
	
	public static void another() {
		int n = 2019;
		int num = 0;
		for (int i = 1; i < n; i++) {
			if ((i + "").indexOf("2") != -1 || (i + "").indexOf("4") != -1)
				continue;
			for (int j = i + 1; j < n; j++) {
				if ((j + "").indexOf("2") != -1 || (j + "").indexOf("4") != -1)
					continue;
				int k = n - i - j;
				if (i == k || j == k || i == j)
					continue;
				if (k > 0 && (k + "").indexOf("2") == -1 && (k + "").indexOf("4") == -1)
					num++;
			}
		}
		System.out.println(num / 3);

	}

}
