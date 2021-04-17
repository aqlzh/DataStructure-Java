package PastExam;

/**
 * @author LZH.create
 *   第九届  蓝桥杯 第二题 方格计数
 *   
 *    题解 ： 最远的方块 顶点 不会超过半径
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
