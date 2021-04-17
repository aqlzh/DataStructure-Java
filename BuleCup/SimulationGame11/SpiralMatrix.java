package SimulationGame11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LZH.create
 *  LeetCode 54  ���������±���˼��
 *     ���� ����  0  1  -1  �ֱ��ʾ  ���� 
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}}  ;
		System.out.println(fun(matrix));
		
		System.out.println(matrix[0].length);
		System.out.println(matrix.length);
	}
	
	public static List<Integer> fun(int [][] arr){
		List ans = new ArrayList<>() ;   // ��¼���
		
		int [] dx = {0,1,0,-1} ;       // �������ʾ����
		int [] dy = {1,0,-1,0} ;
		
		int startX = 0 ;
		int startY = 0 ;
		int row = arr.length ;
		int col = arr[0].length ;
		int d = 0 ;
		
		for(int i =0 ; i < row * col ; i++) {
			ans.add(arr[startX][startY]) ;
			arr[startX][startY] = 101 ;  // ����ѽ��ù�
			
			int curX = startX + dx[d] ;
			int curY = startY + dy[d] ;
			
			if(curX < 0 || curY < 0 || curX >= row || curY  >= col || arr[curX][curY] == 101) {
				d = (d + 1) % 4 ;
				
			}
			
			startX  += dx[d] ;
			startY  += dy[d] ;
			

			
		}
		return ans ;
	}

}
