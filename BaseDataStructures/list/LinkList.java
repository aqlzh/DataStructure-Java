package list;

public class LinkList {
	
	// 首结点
	private  Node head ;
	// 链表长度
	private int n ;
	
	
	public LinkList() {
		n = 0 ;
		head = new Node(null,null) ;
	}
	
	
	// 对象  结构体
	private  static class Node {

		public String item ;
		public Node next ;
		
	
		//  右键 source  构造方法快捷键
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
	    
	    
	    // 判空 
	    public boolean isEmpty() {
	    	return n== 0 ;
	    }
	    
	    public int length () {
	    	return   0 ;
	    }

	    
	    public String get(int index) {
	    	
	         if(index < 0  || index >= n) {
	        	 System.err.println("下标不合法") ;
	        	 return null;
	         }
	    	
		    // 获取第一个结点
	    	Node item = head.next  ;
	    	for (int i = 0 ; i < index ; i++) {
	    		item = item.next ;
	    	}  
	    	return item.item ;
	    }


    	
    	
	    
	    // 在线性表第 i  个元素之前插入  v
	    
	    public void insert(int index , String v) {
	    	if (index < 0 || index >= n) {
	    		System .err.println("位置不合法");
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
	    
	    
	    // 尾插法
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
	    		System.err.println("下标位置不合法") ;
	    		return null ;
	    	}  
	     
	    	Node pre = head  ;
	    	// 寻找  index  之前的元素
	    	for (int i = 0 ; i < index ; i++) {
	    		pre = pre.next ;
	    	}
	    	
	    	
	    	// 获取 当前结点的位置
            // current 为当前节点的位置    	    	
	    	Node  current = pre.next ;
	    	Node next = current.next ;
	    	
	    	pre.next = next ;
	    	n-- ;
	    	return current.item  ;
	    }
	    
	    
	    
	    // 返回线性表 首次出现的元素的索引
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
		list.insert("数据结构");
		System.out.println(list.get(0));
		list.insert("计算机组成原理");
		System.out.println(list.get(1));
		list.insert(0,"计算机网络") ;     // 带序号插入
		System.out.println(list.get(0)+list.get(1));
		System.out.println(list.remove(1));
		System.out.println(list.get(1));
		System.out.println(list.length());
		list.clear(); 
		System.out.println(list.length());
		System.out.println(list.isEmpty());
	}
}
