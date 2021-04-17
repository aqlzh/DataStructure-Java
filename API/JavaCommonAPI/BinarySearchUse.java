package BaseFunction;

/**
 * @author LZH.create
 *     二分查找  应用
 */
public class BinarySearchUse {


	// 一定为 升序
	static int [] arr = {3,4,6,7,8,9,10,11,12,13,14,15,16,17,18,20} ;
	
	static int n = arr.length ;
	
	public static void main(String[] args) {
      
      System.out.println(SearchUse(10));   	
      System.out.println(Search(5));
	}
	
    
	public static int SearchUse(int x){
		// l表示查找区间的左端点, r表示查找区间的右端点，不断更改l和r来实现缩小区间
		int l = 0, r = n-1;
			while(l <= r){
				int mid = l + r >> 1; // (l + r) / 2;
				if(arr[mid] == x){
					return mid; // 找到该值，返回该元素下标
				}
				else if(arr[mid] > x){ // mid位置上的元素大于x
					r = mid - 1; // 说明x在mid的左边
				}
				else l = mid + 1; // mid位置上的元素小于x
			}                     // 说明x在mid的右边
			return -1; //没找到
		}

	
	
	
	
	// 升级二分查找
	
	// 二分查找一个大于等于X的最小值  
	// 在序列中可以正确插入X而不影响序列升序状态的第一个位置。
	
	public static int Search(int x){
		int l = 0, r = n-1;
			while(l < r){
				int mid = l + r >> 1; 
				
				// mid位置上的元素小于x，我们要查找的是大于等于的
				if(arr[mid] < x)
				{ 
					// 所以mid和其左边的全部舍弃
					l = mid + 1; 
				}
				else
				{ 
			    //mid位置上的元素大于等于x,我们不能舍弃,但要向左偏移,所以令r=mid
				r = mid; 
				}
				
			}                 
			return l; 
		}

}
