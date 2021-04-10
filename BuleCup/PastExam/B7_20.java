package PastExam;

import java.util.Scanner;

public class B7_20 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        int n = sc.nextInt() ;
        double sum = 0 ;
        double r = 0 ;
        
        for(int i = 1 ; i <= n ;i++) {
        	  r =  Math.pow(i, 8) ;
        	  sum+=r%123456789 ;
        }
        
//        r = sum % 123456789 ;
        
        //System.out.format("%d",(int)r);
        System.out.println(sum);
		
	}
	
	

//	    static final int mod = 123456789;
//
//	    public static void main(String[] args) throws IOException {
//	        long n = nextInt(System.in), cnt = 0;
//	        for (long i = 1, k = 1; i <= n; k = ++i) {
//	            for (int j = 0; j < 3; j++)
//	                k = (k * k) % mod;
//	            cnt = (cnt + k) % mod;
//	        }
//	        System.out.print(cnt);
//	    }
//
//	    static int nextInt(InputStream in) throws IOException {
//	        int n = 0, c = in.read();
//	        while (c < '0' || c > '9') c = in.read();
//	        while (c >='0' && c <='9') {
//	            n = n * 10 + (c & 0xf); 
//	            c = in.read();
//	        }
//	        return n;
//	    }
	


}
