package BaseFunction;


/**
 * @author LZH.create
 *     ���� ����ʵ��
 */
public class arrangement {

	
	public static void main(String[] args) {

		// ���� A(3 , 6)
		System.out.println(A(3,6));
		
	}
	
	// A(n , m)
	public static int  A(int m ,int n) {
		int result = 1 ;
		
		// m ����ѭ������
		for(int i = m ; i > 0 ;i--) {
			result *= n ;
			n-- ;
		}
		return result ;
	}

}
