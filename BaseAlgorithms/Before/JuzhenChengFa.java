package BaseFunction;

public class JuzhenChengFa {
		 
	  public static void main(String[] args) {
	        //矩阵  --> 行列式
	      
	        double [][]array01 = {
	                {1, 2, 3},
	                {4, 5, 6}
	        };
	        double [][]array02 = {
	                {1, 4},
	                {2, 5},
	                {3, 6}
	        };
	        
	        System.out.println(array01.length);  // 矩阵行
	        System.out.println(array01[0].length);  // 矩阵列
	        
	        double [][] resultMatrix = new double[array01.length][array02[0].length];  // 2x3 3x2  --> 2x2 
	        for (int i = 0 ; i < resultMatrix.length ; i++ ){
	            for(int j = 0 ; j < resultMatrix[0].length ; j++ ){ 
	                for (int num = 0 ; num < array02.length ; num++){
	                        resultMatrix[i][j] = resultMatrix[i][j] + array01[i][num]*array02[num][j];
	                }
	            }
	        }
	         
	        for (int i = 0 ; i < resultMatrix.length ; i++ ){
	            for(int j = 0 ; j < resultMatrix[0].length ; j++ ){
	                System.out.print(resultMatrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
		


}
