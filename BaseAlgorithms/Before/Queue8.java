package BaseFunction;

public class Queue8 {

	   // ����һ��max��ʾ���ж��ٸ��ʺ�
	
		int max = 8;
		
		// ����һ��array������ʺ����λ�õĽ��������arr= {0,4,7,5,2,6,1,3}
		int[] array = new int[max];
		static int count = 0;
		static int judgeCount = 0;

		public static void main(String[] args) {
			// ���԰˻ʺ�
			Queue8 queue8 = new Queue8();
			queue8.check(0);
			System.out.println("һ����" + count + "�ⷨ");
			System.out.println("һ���жϳ�ͻ" + judgeCount + "��");
		}

		// ���������õ�n���ʺ�
		// �ر�ע�⣺check��ÿһ�εݹ�ʱ�����뵽check�ж���for (int i = 0; i < max; i++),��˲�������
		private void check(int n) {
			if (n == max) {// n=8,�˸��ʺ���Ѿ��ź���
				print();
				return;
			}
			// ���η���ʺ󣬲��ж��Ƿ��ͻ
			for (int i = 0; i < max; i++) {
				// �Ȱѵ�ǰ�ʺ󣬷ŵ����еĵ�һ��
				array[n] = i;
				// �жϵ����õ�n���ʺ�i��ʱ���Ƿ��ͻ
				if (judge(n)) {// ����ͻ
					// ���ŷ�n+1���ʺ󣬼���ʼ�ݹ�
					check(n + 1);
				}
				// �����ͻ���ͼ���ִ��array[n]=i;������n���ʺ󣬷����ڱ��еĺ��Ƶ�һ��λ��
			}
		}

		// �鿴�����Ƿ��õ�n���ʺ󣬾�ȥ���ûʺ��Ƿ��ǰ���Ѿ��ڷŵĻʺ��ͻ
		/**
		 * @param n ��ʾ��n���ʺ�
		 * @return
		 */
		private boolean judge(int n) {
			judgeCount++;
			for (int i = 0; i < n; i++) {
				// ˵����
				
				// 1.array[i] == array[n] �ж��Ƿ���ͬһ��
				
				// 2.Math.abs(n - i) == Math.abs(array[n] - array[i]) �ж��Ƿ���ͬһб��
				
				// 3.�ж��Ƿ���ͨһ�У�û�б�Ҫ��nÿ�ζ��ڵ�����
				
				if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
					return false ;
				}
			}
			return true;
		}

		// ��дһ���������Խ��ʺ�ڷŵ�λ�����   
		private void print() {
			count++;
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}

}
