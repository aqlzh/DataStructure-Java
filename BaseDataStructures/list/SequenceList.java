package list;

/**
 * @author LZH.create
 * Date 2012.3.16
 * 效率
 */
public class SequenceList {

	
	private String [] eles  ;
	// 当前 线性表 元素的个数
	private int n ;
	
	
	
	// 构造方法    capacity  容量
	public  SequenceList(int  capacity) {
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
    	
    	// 判断是否已表满
    	if( n == eles.length) {
    		System.err.println("当前表以满") ;
    		  return ;
    		}  
    	
    	
    	if(i >= eles.length) {
    		System.err.println("下标位置非法") ;
    	}
    	
    	// 判断 i  是否合法
    	if (i < 0 ||  i > n ) {
    		System.err.println("下标位置非法") ;
    		return ;
    	}
    	
    	//  把  v  放于 i(index ) 处
    	eles[i] = v ;
    	n++ ;
     }
    
    
    public void insert(String v) {
    	if( n == eles.length) {
    		System.err.println("当前表以满") ;
    		  return ;
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
    	
    	return  result  ;
    }
    
    
    
    // 返回线性表 首次出现的元素的索引
    public int indexOf(String v) {
    	return 0 ;
    }
}

class Test1{
	public static void main(String [] args) {
		SequenceList list = new SequenceList(10) ;
		list.insert("热爱");
		list.insert("效率");
		list.insert("格局");
		list.insert("心态");
		
         System.out.println(list.get(1));
         System.out.println(list.remove(0));
         System.out.println(list.get(0));
         list.clear(); 
         System.out.println(list.length());
		
	}
}
