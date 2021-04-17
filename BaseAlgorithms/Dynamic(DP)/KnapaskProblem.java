package Algorithm;



/**
 * @author LZH.create
 *    ���η�  --> ��̬�滮    
 */
public class KnapaskProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [] w = {1,4,3} ;  // ������Ʒ������
		 
		 int[] val = {1500, 3000, 2000}; //��Ʒ�ļ�ֵ ����val[i] ����ǰ���v[i]
			int m = 4; //����������
			int n = val.length; //��Ʒ�ĸ���
			
			
			
			
			//v[i][j] ��ʾ��ǰi����Ʒ���ܹ�װ������Ϊj�ı����е�����ֵ
			int[][] v = new int[n+1][m+1] ;    // ���е� 1 Ϊ 0 ��
 			
			
			//Ϊ�˼�¼������Ʒ����������Ƕ�һ����ά����
			int[][] path = new int[n+1][m+1];
			
			//��ʼ����һ�к͵�һ��, �����ڱ������У����Բ�ȥ������ΪĬ�Ͼ���0
			for(int i = 0; i < v.length; i++) {
				v[i][0] = 0; 
			}
			for(int i=0; i < v[0].length; i++) {
				v[0][i] = 0; 
			}
			

			// ��̬�滮 
			for(int i = 1; i < v.length; i++) {  
				for(int j=1; j < v[0].length; j++) { 
					//��ʽ
					if(w[i-1]> j) { // ��Ϊ���ǳ���i �Ǵ�1��ʼ�ģ����ԭ����ʽ�е� w[i] �޸ĳ� w[i-1]
						v[i][j]=v[i-1][j];
					} else {
				
						if(v[i - 1][j] < val[i - 1] + v[i - 1][j - w[i - 1]]) {
							v[i][j] = val[i - 1] + v[i - 1][j - w[i - 1]];
							//�ѵ�ǰ�������¼��path
							path[i][j] = 1;     // �ѷŹ������ļ�¼
						} else {
							v[i][j] = v[i - 1][j];
						}
						
					}
				}
			}
			
			//���һ��v ����Ŀǰ�����
			for(int i =0; i < v.length;i++) {
				for(int j = 0; j < v[0].length;j++) {
					System.out.print(v[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("============================");

		
			int i = path.length - 1; //�е�����±�
			int j = path[0].length - 1;  //�е�����±�
			
			while(i > 0 && j > 0 ) { //��path�����ʼ��
				if(path[i][j] == 1) {
					System.out.printf("��%d����Ʒ���뵽����\n", i); 
					j -= w[i-1]; //w[i-1]     �Ӻ��濪ʼ  ������������
				}
				i--;
			}
			
	}

}
