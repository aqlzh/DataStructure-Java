package BaseFunction;

/**
 * @author LZH.create
 *     ������  �㷨
 */
public class FastPower {

	public static void main(String[] args) {
   
		
		System.out.println(fun(2,10));
		
	}
	
	
	
	// �����Ŀ ��Ŀ����  ע�� ���� mod
	public static long fun(int a, int b) { // a ^ b
		long res = 1 ;
		while(b != 0) {
			if(( b & 1) == 1) {  //�ж϶����� ���һλ�� ��Ϊ 1 Ҳ������
				res *= a ;
			}
			a = a * a ;   // ָ����1
			b = b >> 1 ;   // �� b ����һλ
		}
		
		return res ;
	}

}
