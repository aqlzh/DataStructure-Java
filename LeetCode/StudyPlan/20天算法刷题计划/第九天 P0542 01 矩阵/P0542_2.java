package leetcodePlan;

public class P0542_2 {

	
	//  �ⷨ���� ���ö�̬�滮�㷨
	public static void main(String[] args) {
		int [][] mat = {{0,0,0},{0,1,0},{1,1,1}} ;
		
		int [][] res = fun(mat) ;
		for(int i =0 ; i <res.length ; i++) {
			for(int j =0 ; j <res[0].length ;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public static int[][] fun(int[][] mat) {
		int m = mat.length ;
		int n = mat[0].length ;
		
		int [][] dist = new int[m][n] ;
		// ��ʼ����̬�滮����
		for(int i = 0 ; i < m ;i++) {
			for(int j =0 ; j < n ;j++) {
				dist[i][j] = Integer.MAX_VALUE /2 ;
			}
		}
		
	     for (int i = 0; i < m; ++i) {
	            for (int j = 0; j < n; ++j) {
	                if (mat[i][j] == 0) {
	                    dist[i][j] = 0;
	                }
	            }
	        }

	     
	     
	      //   i ����       j ����
	     // ֻ�� ˮƽ�����ƶ� �� ��ֱ�����ƶ���ע�⶯̬�滮�ļ���˳��
	        for (int i = 0; i < m; ++i) {
	            for (int j = 0; j < n; ++j) {
	                if (i - 1 >= 0) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
	                }
	                if (j - 1 >= 0) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
	                }
	            }
	        }
	        // ֻ�� ˮƽ�����ƶ� �� ��ֱ�����ƶ���ע�⶯̬�滮�ļ���˳��
	        for (int i = m - 1; i >= 0; --i) {
	            for (int j = 0; j < n; ++j) {
	                if (i + 1 < m) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i + 1][j] + 1);
	                }
	                if (j - 1 >= 0) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
	                }
	            }
	        }
	        // ֻ�� ˮƽ�����ƶ� �� ��ֱ�����ƶ���ע�⶯̬�滮�ļ���˳��
	        for (int i = 0; i < m; ++i) {
	            for (int j = n - 1; j >= 0; --j) {
	                if (i - 1 >= 0) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
	                }
	                if (j + 1 < n) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
	                }
	            }
	        }
	        // ֻ�� ˮƽ�����ƶ� �� ��ֱ�����ƶ���ע�⶯̬�滮�ļ���˳��
	        for (int i = m - 1; i >= 0; --i) {
	            for (int j = n - 1; j >= 0; --j) {
	                if (i + 1 < m) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i + 1][j] + 1);
	                }
	                if (j + 1 < n) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
	                }
	            }
	        }
	        return dist;

		
	}

}
