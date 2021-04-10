package Algorithm;

/**
 * @author LZH.create
 *    ʹ�÷��η�  �����ŵ������
 */
public class HanoiTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoiTower(3, 'A', 'B', 'C');
	}
	
	
	// �� n ������ �� A �� ������ B�� �ƶ� �� C ��
	
	// �����  ��Ҫ    ����  a b c �ֱ����              ��ʼ��    ��վ��    ������
	public static void hanoiTower(int num ,char a,char b ,char c) {
	    // �ݹ���ֹ����
		if(num == 1) {
			System.out.println("��1���̴� " + a + "-->" + c) ;
		} else {
			//��������� n >= 2 ������������ǿ��Կ����������� 1.���±ߵ�һ���� 2. �����������
			//1. �Ȱ� ������������� A->B�� �ƶ����̻�ʹ�õ� c
			hanoiTower(num - 1, a, c, b);
			
			
			//2. �����±ߵ��� A->C
			System.out.println("��" + num + "���̴� " + a + "-->" + c);
			
			
			//3. ��B���������� �� B->C , �ƶ�����ʹ�õ� a��  
			hanoiTower(num - 1, b, a, c);
			
		}
		
		
	}

}
