package leetcodePlan;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P0120 {

	public static void main(String[] args) {

		    //List<List<Integer>> triangle = [[2],[3,4],[6,5,7],[4,1,8,3]] ;
			// {{2},{3,4},{6,5,7},{4,1,8,3}} ;
		
		//  初始化
		List<List<Integer>> triangle = new ArrayList<>();
		Deque<Integer> row1 = new ArrayDeque<>(1);
		Deque<Integer> row2 = new ArrayDeque<>(2);
		Deque<Integer> row3 = new ArrayDeque<>(3);
		Deque<Integer> row4 = new ArrayDeque<>(4);
		row1.addLast(2);
		
		row2.addLast(3) ;
		row2.addLast(4) ;
		
		row3.addLast(6);
		row3.addLast(5);
		row3.addLast(7);
		
		row4.addLast(4);
		row4.addLast(1);
		row4.addLast(8);
		row4.addLast(3);
		
		
		triangle.add(new ArrayList<>(row1)) ;
		triangle.add(new ArrayList<>(row2)) ;
		triangle.add(new ArrayList<>(row3)) ;
		triangle.add(new ArrayList<>(row4)) ;
		
		
		System.out.println(fun(triangle));
	}
	
	public static int fun(List<List<Integer>> triangle) {
		int n = triangle.size() ;    // 有点类似于  二维数组
		
		int [][] dp = new int[n+1][n+1] ;
		
		
		//  从三角形得最后一行  开始递归
		
		for(int i = n -1 ; i >= 0 ; i-- ) {    // 行
			for(int j = 0 ; j <= i ;j++) {     // 列
				dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1] )+ triangle.get(i).get(j) ;
			}
		}
		
		return dp[0][0] ;
	}

}
