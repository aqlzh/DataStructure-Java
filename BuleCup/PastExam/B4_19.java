package PastExam;

/**
 * @author LZH.create
 *     蓝桥杯 真题 第十届 2019
 *  Date : 21.4.17   
 *     试题 D  数的分解   
 */
public class B4_19 {

	
	public static void main(String[] args) {

		int count = 0 ;
        for(int i = 1 ; i <= 2019 ; i++) {		
        	//if(i+"".indexOf("2") != -1 || i+"".indexOf("4") != -1) break ;        // 注意不是 break 是 continue
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
