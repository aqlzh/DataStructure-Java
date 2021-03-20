package list;


/**
 * @author LZH.create
 *  @Date 2021.3.19
 *    Ȱ��רע��ǰ��
 */
public class TowWayLinkList {
	
	// �׽��
	private  Node first ;
	private  Node last ; 
	// ������
	private int n ;
	

	// ����  �ṹ��
	private  static class Node {

		public String item ;
		public Node next ;
		public Node pre ;
		
	
		//  �Ҽ� source  ���췽����ݼ�
		public Node(String item,Node pre , Node next) {
			super();
			this.item = item;
			this.pre = pre;
			this.next = next;
		}
	
		
	}
	  public TowWayLinkList() {
		  last = null ;
		  first = new Node(null,null,null) ;
		  n = 0 ;
	  }
	
	   public void clear() {
		   last = null ;
		   first.item = null ;
		   first.next = null ;
		   first.pre = null ;
		   n = 0 ;
	    	
	    } 
	    
	    
	    // �п� 
	    public boolean isEmpty() {
	    	return n== 0 ;
	    }
	    
	    public int length () {
	    	return   0 ;
	    }

	    
	    public String get(int index) {
	    	
	         if(index < 0  || index >= n) {
	        	 System.err.println("�±겻�Ϸ�") ;
	        	 return null;
	         }
	    	
		    // ��ȡ��һ�����
	    	Node item = first.next  ;
	    	for (int i = 0 ; i < index ; i++) {
	    		item = item.next ;
	    	}  
	    	return item.item ;
	    }


    	
    	
	    
	    // �����Ա�� i  ��Ԫ��֮ǰ����  v    β�巨
	    
	    public void insert( String v) {
	    	
	    	// ע���������ͷ�ڵ�
	    	if (last == null) {
	    		last = new Node (v,first,null) ;
	    		first.next = last ;
	    	} else {
	    		Node oldLast = last ;
	    		Node node = new Node (v,oldLast,null) ;
	    		oldLast.next = node ;
	    		last = node ;
	    	}
	    	
	          n++ ;
	     }
	    
	    
	    public  void  resize(int newSize) {
	    	
	    }
	    
	    
	    // ָ��λ�ò���
	    public void insert(int index ,String v) {
	    	if(index < 0 || index >= n) {
	    		System.err.println("�±�λ�ò��Ϸ�") ;
	    		return  ;
	    	} 
	    	
	    	// ��ȡͷ�ڵ�
	    	
	    	Node pre = first ;
	    	for (int i = 0 ; i < index ; i++) {
	    		pre = pre.next ;
	    	}
	    	
	    	Node next = pre.next ;
	    	Node newNode = new Node(v,pre,next) ;
	    	
	    	pre.next = newNode ;
	    	next.pre = newNode ;
	    	
	    	n++ ;
	    }
	    
	    
	    public String remove( int index) {
	    	if(index < 0 || index >= n) {
	    		System.err.println("�±�λ�ò��Ϸ�") ;
	    		return null ;
	    	}  
	     
	    	Node pre = first  ;
	    	// Ѱ��  index  ֮ǰ��Ԫ��
	    	for (int i = 0 ; i < index ; i++) {
	    		pre = pre.next ;
	    	}
	    	
	    	
	    	// ��ȡ ��ǰ����λ��
            // current Ϊ��ǰ�ڵ��λ��    	    	
	    	Node  current = pre.next ;
	    	Node next = current.next ;
	    	
	    	pre.next = next ;
	    	next.pre = pre ;
	    	n-- ;
	    	return current.item  ;
	    }
	    
	    
	    
	    // �������Ա� �״γ��ֵ�Ԫ�ص�����
	    public int indexOf(String v) {
	    	return 0 ;
	    }
	    
	    
	    // ��ȡ��һ�������һ��Ԫ��
	    
	    public String getFirst() {
	    	if (isEmpty()) {
	    		return null ;
	    	}
	    	return first.next.item ;
	    } 
	    
	    
	    public String getLast() {
	    	
	     	if (isEmpty()) {
	    		return null ;
	    	}
	    	return last.item ;
	    }
	
	public static void main(String[] args) {
	
	}

}


class Test4{
	public static void main(String [] args) {
		TowWayLinkList list = new TowWayLinkList() ;
		list.insert("���ݽṹ");
		System.out.println(list.get(0));
		list.insert("��������ԭ��");
		System.out.println(list.get(1));
		list.insert(0,"���������") ;     // ����Ų���
		System.out.println(list.get(0)+list.get(1));
		System.out.println(list.remove(1));
		System.out.println(list.get(1));
		System.out.println(list.length());
		list.clear(); 
		System.out.println(list.length());
		System.out.println(list.isEmpty());
	}
}
