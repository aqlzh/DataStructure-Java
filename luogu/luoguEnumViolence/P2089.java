package luoguEnumViolence;

/**
 * @author LZH.create
 *     ��ѧ�� ��ʲô  dfs  
 */
import java.util.Scanner;

/**
 * @author LZH.create
 *    ����  dfs �㷨   ���еĻ��ݷ�����  ) :
 */

public class P2089 {

    static int flag = 0 ;
	static int sum = 0 ;
	static long [][]  ans = new long [100000000][11] ;  // �� 1 ��ʼ��¼ 10 �� 
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
	 * @param dep     Ϊ��ǰ�ŵڼ�������
	 * @param total   ��ǰ���Ϻ�
	 * @param n       ��ζ�̶�
	 *  ע�⴫�Ĳ��Ǿ�̬����
	 */
	public static void dfs(int dep ,int total ,int n){   
		if(dep == 11) {    // ��ֹ����
			if(total == n) {
				flag = 1; 
				sum++ ;  // ͳ�Ʒ�������
				for(int j = 1 ; j <= 10 ;j++) ans[sum][j] = smile[j] ;
				
			}
			
			return ;
		} else { 
			for(int i =1 ; i <= 3 ;i++) {
				 if(total + i > n)	 break ;	
				  else { 
					  smile[dep] = i ;
					  dfs(dep+1,total+1,n) ;
					  smile[dep] = 0 ;  // ����
				  }
			}
		}
		
		
	}

}
