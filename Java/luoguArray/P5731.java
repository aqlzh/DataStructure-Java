package luoguArray;

import java.util.Scanner;



/**
 * @author LZH.create
 * Date : 2021.3.31
 *  右   下  左  上
 */
public class P5731 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in)  ;
		
		int n = sc.nextInt() ;
		
		int k=1,x=1,y=0;
		
		int [][] a = new int[15][15];
		while (k<=n*n)
		{
			while(y<n&& a[x][y+1]==0)a[x][++y]=k++;   // y=0
			while(x<n&&a[x+1][y]==0)a[++x][y]=k++;
			while(y>1&&a[x][y-1]==0)a[x][--y]=k++;
			while(x>1&&a[x-1][y]==0)a[--x][y]=k++;
		}
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++) {
				System.out.format("%3d",a[i][j]);
				if(j%n==0) System.out.println();
			}
			
		}
		
//		int k = 1 ;
//		int x = 0;
//		int y = 0 ;
//		
//		int [][] arr = new int[n+1][n+1] ;
//		
//		
//		// k++  --> k=k+1  ; k+1 就是 k+1 
//		while(k <= n*n) {
//			while(y < n && arr[x][y+1] == 0 ) arr[x][y++]= k++ ;   /01   -> 00
//			
//			while(x < n && arr[x+1][y] == 0 ) arr[x++][y]= k++ ;
//			while(y > 0 && arr[x][y-1] == 0 ) arr[x][y--]= k++ ;
//			while(x > 0 && arr[x-1][y] == 0 ) arr[x--][y]= k++ ;			
//		}
//		
//		for(int i = 0 ; i < n ;i++) {
//			for(int j = 0 ; j < n ; j++) {
//				System.out.format("%3d",arr[i][j]);
//				if(j != 0 && j%(n-1)==0) System.out.println();
//				
//			}
//		}
	}

}
