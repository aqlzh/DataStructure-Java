package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author LZH.create
 *   二分查找求数的范围
 */
public class BinarySearchNum {

	    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	    static String[] s = new String[100010];
	    static int[] arr = new int[100010];
	    static int n, q;
	    
	    public static int findl(int x){
	        int l = 0, r = n-1;
	        while(l < r){
	            int mid = l + r >> 1;
	            if(arr[mid] < x) l = mid + 1;
	            else r = mid;  
	        }
	        return l;
	    }
	      public static int findr(int x){
	        int l = 0, r = n-1;
	        while(l < r){
	            int mid = l + r + 1 >> 1;
	            if(arr[mid] > x) r = mid - 1;
	            else l = mid;  
	        }
	        return l;
	    }
	    
	    public static void main(String[] agrs) throws IOException {
	        String[] test = in.readLine().split(" ");
	        n = Integer.valueOf(test[0]);
	        q = Integer.valueOf(test[1]);
	        
	        s = in.readLine().split(" ");
	        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);
	        for(int i = 0; i < q; i++){
	            int x = Integer.valueOf(in.readLine());
	            int l = findl(x);
	            int r = findr(x);
	            if(x != arr[l]) out.write("-1 -1\n"); //  找不到  不存在  
	            else out.write(l + " " + r + "\n");
	        }
	        out.flush();
	    } 
	    
	    


}
