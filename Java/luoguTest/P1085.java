package luoguTest;

import java.util.Arrays;
import java.util.Scanner;

public class P1085 {

	public static void main(String[] args) {
		
	        
			// �洢����    ������ʽ
			Scanner sc = new Scanner(System.in);
			int[][] a = new int[2][7]; //����һ��7��2�еĶ�ά����
			for(int i = 0;i < 7;i++) { //����ά������������
				for(int j = 0;j < 2;j++) {
					a[j][i] = sc.nextInt();
				}
			}
			
			// �������ж����
			int[] b = new int[7]; //����һ���������洢�Ӻ� �� ����������
			int[] c = new int[7]; //����һ������������ԭ�������ݣ���������ѯ�±꣩
			
			
			for(int i = 0;i < 7;i++) { //�������������ӵĴ�С����ֵ������b c
				b[i] = a[0][i] + a[1][i];
				c[i] = a[0][i] + a[1][i];
				//�����ں��治ͬ��;������
			}
			
			boolean flag = false;
			for(int i = 0;i < 7;i++) {
				if(b[i] > 8) { //�ж���治���ڲ����˵�һ�죨�Ӻʹ���8��
					flag = true;
				}
			}
			
			if(flag) { //������ڲ�����
				int day= 0 ;
				Arrays.sort(b); //��b������Ԫ�ؽ�����������
				for(int i = 0;i < 7;i++) {
					if(b[6] == c[i]) {    // ��Ϊ����� b[6]   ���   ��һ�����
						day = i+1;
						break; //�������⣬�����ǰ��һ�죬�ʴ���ѭ��
					}
				}
				System.out.println(day);
			}else {
				System.out.println(0);
			}
		}

	
}

