package list;

public class LinkList {
	
	// �׽��
	private  Node head ;
	// ������
	private int n ;
	
	
	public LinkList() {
		n = 0 ;
		head = new Node(null,null) ;
	}
	
	
	// ����  �ṹ��
	private  static class Node {

		public String item ;
		public Node next ;
		
	
		//  �Ҽ� source  ���췽����ݼ�
		public Node(String item, Node next) {
			super();
			this.item = item;
			this.next = next;
		}
	
		
	}
	
	
	   public void clear() {
		   
		   head.item = null ;
		   head.next = null ;
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
	    	Node item = head.next  ;
	    	for (int i = 0 ; i < index ; i++) {
	    		item = item.next ;
	    	}  
	    	return item.item ;
	    }


    	
    	
	    
	    // �����Ա�� i  ��Ԫ��֮ǰ����  v
	    
	    public void insert(int index , String v) {
	    	if (index < 0 || index >= n) {
	    		System .err.println("λ�ò��Ϸ�");
	    	    return ;
	    	} 
	    	
	    	Node pre = head ;
	    	for( int i = 0 ; i < index ; i++) {
	    		pre = pre.next ;
	    	} 
	    	
	    	Node next = pre.next ;
	    	
	    	Node newNode = new Node(v,next) ;
	    	pre.next = newNode ;
	    	
	    	n++ ;
	           
	     }
	    
	    
	    public  void  resize(int newSize) {
	    	
	    }
	    
	    
	    // β�巨
	    public void insert(String v) {
	    	
	    	Node  node = head ;
	    	
	    	while(node.next != null) {
	    		node = node.next ;
	    	}
	    	
	    	
	    	Node newNode = new Node(v,null) ;
	    	node.next = newNode ;
	    	n ++ ;
	    	
	    }
	    
	    
	    public String remove( int index) {
	    	if(index < 0 || index >= n) {
	    		System.err.println("�±�λ�ò��Ϸ�") ;
	    		return null ;
	    	}  
	     
	    	Node pre = head  ;
	    	// Ѱ��  index  ֮ǰ��Ԫ��
	    	for (int i = 0 ; i < index ; i++) {
	    		pre = pre.next ;
	    	}
	    	
	    	
	    	// ��ȡ ��ǰ����λ��
            // current Ϊ��ǰ�ڵ��λ��    	    	
	    	Node  current = pre.next ;
	    	Node next = current.next ;
	    	
	    	pre.next = next ;
	    	n-- ;
	    	return current.item  ;
	    }
	    
	    
	    
	    // �������Ա� �״γ��ֵ�Ԫ�ص�����
	    public int indexOf(String v) {
	    	return 0 ;
	    }
	
	public static void main(String[] args) {
		Node node1 = new Node("a",null) ;
		Node node2 = new Node("b",null) ;
		Node node3 = new Node("c",null) ;
		
		node1.next = node2;
		node2.next = node3;
		
	}

}


class Test3{
	public static void main(String [] args) {
		LinkList list = new LinkList() ;
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
