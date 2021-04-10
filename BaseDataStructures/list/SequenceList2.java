package list;

/**
 * @author LZH.create
 * @version 2012.3.16
 * 
 */
public class SequenceList2 {

	
	private String [] eles  ;
	// 当前 线性表 元素的个数
	private int n ;
	
	
	
	// 构造方法    capacity  容量
	public  SequenceList2(int  capacity) {
		
	// 对传的数据进行处理
	if (capacity < 1) {
		capacity = 1 ;
	}
		
	eles = new String [capacity] ;
	n = 0 ;
	}
	
	
    public void clear() {
    	n = 0 ;
    	// 将整个数据置空
    	eles = new String [eles.length] ;
    } 
    
    
    // 判空 
    public boolean isEmpty() {
    	return n == 0 ;
    }
    
    public int length () {
    	return   n ;
    }

    
    public String get(int index) {
    	
    	if (index < 0 || index >= n) {
    		System.err.println("当前元素不存在")   ;
    		return null ;
    	}
    	
    	return  eles[index];
    }
    
    
    // 在线性表第 i  个元素之前插入  v
    
    public void insert(int i , String v) {
    	
    	// 判断 i  是否合法
    	if (i < 0 ||  i > n ) {
    		System.err.println("下标位置非法") ;
    		return ;
    	}
    	
    	// 判断是否已表满
    	if( n == eles.length) {
    		 resize(eles.length * 2) ;
    		}  
    	
    	
    	for( int j = n  ; j > i ; j++) {
    		eles [j] = eles [j - 1] ; 
    	}  
    
    	
    	//  把  v  放于 i(index ) 处
    	eles[i] = v ;
    	n++ ;
     }
    
    
    public  void  resize(int newSize) {
    	// 记录旧数组
    	String [] temp = eles ;
    	// 创建新数组  
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
    		System.err.println("当前元素不存在")   ;
    		return null ;
    	}
    	
    	// 获取要删除的元素
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
    
    
    
    // 返回线性表 首次出现的元素的索引
    public int indexOf(String v) {
    	return 0 ;
    }
}

class Test2{
	public static void main(String [] args) {
		SequenceList2 list = new SequenceList2(0) ;
		
		// 以下操作可以显示出可变长度
		list.insert("热爱") ;
		System.out.println(list.length());
		list.insert("效率");
		System.out.println(list.length());
		list.insert("格局");
		System.out.println(list.length());
		list.insert("心态");
		System.out.println(list.length());
		
		
	}
}
