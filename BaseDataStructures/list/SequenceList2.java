package list;

/**
 * @author LZH.create
 * @version 2012.3.16
 * 
 */
public class SequenceList2 {

	
	private String [] eles  ;
	// ��ǰ ���Ա� Ԫ�صĸ���
	private int n ;
	
	
	
	// ���췽��    capacity  ����
	public  SequenceList2(int  capacity) {
		
	// �Դ������ݽ��д���
	if (capacity < 1) {
		capacity = 1 ;
	}
		
	eles = new String [capacity] ;
	n = 0 ;
	}
	
	
    public void clear() {
    	n = 0 ;
    	// �����������ÿ�
    	eles = new String [eles.length] ;
    } 
    
    
    // �п� 
    public boolean isEmpty() {
    	return n == 0 ;
    }
    
    public int length () {
    	return   n ;
    }

    
    public String get(int index) {
    	
    	if (index < 0 || index >= n) {
    		System.err.println("��ǰԪ�ز�����")   ;
    		return null ;
    	}
    	
    	return  eles[index];
    }
    
    
    // �����Ա�� i  ��Ԫ��֮ǰ����  v
    
    public void insert(int i , String v) {
    	
    	// �ж� i  �Ƿ�Ϸ�
    	if (i < 0 ||  i > n ) {
    		System.err.println("�±�λ�÷Ƿ�") ;
    		return ;
    	}
    	
    	// �ж��Ƿ��ѱ���
    	if( n == eles.length) {
    		 resize(eles.length * 2) ;
    		}  
    	
    	
    	for( int j = n  ; j > i ; j++) {
    		eles [j] = eles [j - 1] ; 
    	}  
    
    	
    	//  ��  v  ���� i(index ) ��
    	eles[i] = v ;
    	n++ ;
     }
    
    
    public  void  resize(int newSize) {
    	// ��¼������
    	String [] temp = eles ;
    	// ����������  
    	eles = new String[newSize] ;
    	
    	for(int i = 0 ; i < n ; i++) {
    		eles[i] = temp[i] ;
    	}
    }
    
    public void insert(String v) {
    	if( n == eles.length) {
    		 resize(eles.length * 2) ;
    		}  
    	
    	eles[n++] = v ;
    }
    
    
    public String remove( int index) {
    	
    	if (index < 0 || index >= n) {
    		System.err.println("��ǰԪ�ز�����")   ;
    		return null ;
    	}
    	
    	// ��ȡҪɾ����Ԫ��
    	String result = eles[index] ;
    	
    	for( int i = index  ; i < n- 1 ; i++) {
    		eles [i] = eles [i + 1] ; 
    	}  
    	
    	n -- ;
    	
    	
    	if( n > 0 && n < eles.length / 4) {
    		resize(eles.length / 2) ;
    	}
    	
    	return  result  ;
    }
    
    
    
    // �������Ա� �״γ��ֵ�Ԫ�ص�����
    public int indexOf(String v) {
    	return 0 ;
    }
}

class Test2{
	public static void main(String [] args) {
		SequenceList2 list = new SequenceList2(0) ;
		
		// ���²���������ʾ���ɱ䳤��
		list.insert("�Ȱ�") ;
		System.out.println(list.length());
		list.insert("Ч��");
		System.out.println(list.length());
		list.insert("���");
		System.out.println(list.length());
		list.insert("��̬");
		System.out.println(list.length());
		
		
	}
}
