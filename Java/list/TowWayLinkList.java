package list;


/**
 * @author LZH.create
 *  @Date 2021.3.19
 *    劝君专注案前事
 */
public class TowWayLinkList {
	
	// 首结点
	private  Node first ;
	private  Node last ; 
	// 链表长度
	private int n ;
	

	// 对象  结构体
	private  static class Node {

		public String item ;
		public Node next ;
		public Node pre ;
		
	
		//  右键 source  构造方法快捷键
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
	    	Node item = first.next  ;
	    	for (int i = 0 ; i < index ; i++) {
	    		item = item.next ;
	    	}  
	    	return item.item ;
	    }


    	
    	
	    
	    // 在线性表第 i  个元素之前插入  v    尾插法
	    
	    public void insert( String v) {
	    	
	    	// 注意此链表有头节点
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
	    
	    
	    // 指定位置插入
	    public void insert(int index ,String v) {
	    	if(index < 0 || index >= n) {
	    		System.err.println("下标位置不合法") ;
	    		return  ;
	    	} 
	    	
	    	// 获取头节点
	    	
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
	    		System.err.println("下标位置不合法") ;
	    		return null ;
	    	}  
	     
	    	Node pre = first  ;
	    	// 寻找  index  之前的元素
	    	for (int i = 0 ; i < index ; i++) {
	    		pre = pre.next ;
	    	}
	    	
	    	
	    	// 获取 当前结点的位置
            // current 为当前节点的位置    	    	
	    	Node  current = pre.next ;
	    	Node next = current.next ;
	    	
	    	pre.next = next ;
	    	next.pre = pre ;
	    	n-- ;
	    	return current.item  ;
	    }
	    
	    
	    
	    // 返回线性表 首次出现的元素的索引
	    public int indexOf(String v) {
	    	return 0 ;
	    }
	    
	    
	    // 获取第一个与最后一个元素
	    
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
