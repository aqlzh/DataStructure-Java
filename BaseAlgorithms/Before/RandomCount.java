package BaseFunction;


/**
 * @author LZH.create
 *   随机数统计算法   --> 统计一串数字的 所有数字 出现的次数
 */
public class RandomCount {
	public static void main(String [] args) {
		
		
		
        long num = 12345678900l;
        String strNum = String.valueOf(num);
        numberCount(strNum);
    }

    private static void numberCount(String strNum) {
        int[] c = new int[10];  //初始化都为0     0 ~9 
        
        for (int i = 0; i < strNum.length(); i++) {
            char cTemp = strNum.charAt(i); //获得下标i的字符      //数字的ASCII范围为：48~57
            int index = cTemp - 48;    //类型转换  //由于strNum中都是数字，所以index范围：0~9
            c[index]++;     //对应下标的数量自增
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + "出现" + c[i] + "次");
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
