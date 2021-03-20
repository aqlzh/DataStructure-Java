package list;

/**
 * @author LZH.create
 * Date 2012.3.16
 * Ч��
 */
public class SequenceList {

	
	private String [] eles  ;
	// ��ǰ ���Ա� Ԫ�صĸ���
	private int n ;
	
	
	
	// ���췽��    capacity  ����
	public  SequenceList(int  capacity) {
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
    	
    	// �ж��Ƿ��ѱ���
    	if( n == eles.length) {
    		System.err.println("��ǰ������") ;
    		  return ;
    		}  
    	
    	
    	if(i >= eles.length) {
    		System.err.println("�±�λ�÷Ƿ�") ;
    	}
    	
    	// �ж� i  �Ƿ�Ϸ�
    	if (i < 0 ||  i > n ) {
    		System.err.println("�±�λ�÷Ƿ�") ;
    		return ;
    	}
    	
    	//  ��  v  ���� i(index ) ��
    	eles[i] = v ;
    	n++ ;
     }
    
    
    public void insert(String v) {
    	if( n == eles.length) {
    		System.err.println("��ǰ������") ;
    		  return ;
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
    	
    	return  result  ;
    }
    
    
    
    // �������Ա� �״γ��ֵ�Ԫ�ص�����
    public int indexOf(String v) {
    	return 0 ;
    }
}

class Test1{
	public static void main(String [] args) {
		SequenceList list = new SequenceList(10) ;
		list.insert("�Ȱ�");
		list.insert("Ч��");
		list.insert("���");
		list.insert("��̬");
		
         System.out.println(list.get(1));
         System.out.println(list.remove(0));
         System.out.println(list.get(0));
         list.clear(); 
         System.out.println(list.length());
		
	}
}
