package luoguEnumViolence;

/**
 * @author LZH.create
 *     不学好 用什么  dfs  
 */
import java.util.Scanner;

/**
 * @author LZH.create
 *    运用  dfs 算法   其中的回溯法好难  ) :
 */

public class P2089 {

    static int flag = 0 ;
	static int sum = 0 ;
	static long [][]  ans = new long [100000000][11] ;  // 从 1 开始记录 10 个 
	static int [] smile = new int[11] ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in) ;
        
        int n = sc.nextInt() ;
        
        dfs(1,0,n) ;
		if(flag==1) {
			System.out.println(sum);
			
			for(int i = 1 ; i <= sum ;i++) {
				for(int j = 1 ; j <=10 ;j++) {
					System.out.print(ans[i][j] + " ");
				}
				System.out.println();
			}
		}else if(flag ==0){
			System.out.println(0);
		}
	}
	
	/**
	 * 
	 * @param dep     为当前放第几种配料
	 * @param total   当前配料和
	 * @param n       美味程度
	 *  注意传的不是静态方法
	 */
	public static void dfs(int dep ,int total ,int n){   
		if(dep == 11) {    // 终止条件
			if(total == n) {
				flag = 1; 
				sum++ ;  // 统计方案总数
				for(int j = 1 ; j <= 10 ;j++) ans[sum][j] = smile[j] ;
				
			}
			
			return ;
		} else { 
			for(int i =1 ; i <= 3 ;i++) {
				 if(total + i > n)	 break ;	
				  else { 
					  smile[dep] = i ;
					  dfs(dep+1,total+1,n) ;
					  smile[dep] = 0 ;  // 回溯
				  }
			}
		}
		
		
	}

}
