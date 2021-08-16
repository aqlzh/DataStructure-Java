package luoguFunction;
import java.util.Scanner; 

public class P1304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		
		for(int i = 0 ; i<= n ;i++) {
			for(int j =2 ;j <n/2 ;j++ ) {
				if(p(j)&&p(i-j))  System.out.println(i+"="+ j+ "+" + (i-j));
			}
		}

	}
	
	
	
	// ÇóÖÊÊý
	public static boolean p(int n) {

	 for(int i = 2 ; i <= Math.sqrt(n) ;i++) 
		 if(n%i==0) return false ;
		     return true ;
	 
	}

}
