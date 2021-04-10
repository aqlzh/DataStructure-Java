package PastExam;



/**
 * @author LZH.create
 *     Integer.MAX_VALUE 最大值
 */
public class B3_20 {

	public static void main(String[] args) {

		// sum  为试剂盒  求此 如何最省 
		int min=0;
		int sum=Integer.MAX_VALUE;
		
		// 假设一共有  100 人
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
