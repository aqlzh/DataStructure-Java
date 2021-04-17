package SimulationGame11;

import java.util.Scanner;

/**
 * @author LZH.create
 *      ��ʮһ�����ű�ģ����  ��ת����  ��ϵ����
  */
public class rotateMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		int m = sc.nextInt() ;
		int x = sc.nextInt() ;
		int y = sc.nextInt()  ;
		
		int [][] arr = new int[m][n] ;
		
		 //System.out.println(array01.length);  // ������  
	     //System.out.println(array01[0].length);  // ������ 
	        
		int temp = 1 ;
		
		int up = 0 ;
		int down = arr.length-1 ;
		int left = 0 ;	
		int right = arr[0].length - 1 ;
		
        while(true){
       
            for(int i=left; i<=right; ++i)    // ��
                arr[up][i]=temp++;   
            
                if(++up>down) break;  // ���� up �������������� up Լ������
            for(int i=up; i<=down; ++i)      // ��
            	arr[i][right]=temp++;
            
                if(--right<left)  break;
            for(int i=right; i>=left; --i)   // ��
            	arr[down][i]=temp++;
            
                if(--down<up) break;
            for(int i=down; i>=up; --i)     // ��    ����� up ��Ϊ 1
                arr[i][left]=temp++;
            
                if(++left>right)  break;
        }

			
        System.out.println(arr[x-1][y-1]);
	}

}
