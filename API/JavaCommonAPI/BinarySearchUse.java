package BaseFunction;

/**
 * @author LZH.create
 *     ���ֲ���  Ӧ��
 */
public class BinarySearchUse {


	// һ��Ϊ ����
	static int [] arr = {3,4,6,7,8,9,10,11,12,13,14,15,16,17,18,20} ;
	
	static int n = arr.length ;
	
	public static void main(String[] args) {
      
      System.out.println(SearchUse(10));   	
      System.out.println(Search(5));
	}
	
    
	public static int SearchUse(int x){
		// l��ʾ�����������˵�, r��ʾ����������Ҷ˵㣬���ϸ���l��r��ʵ����С����
		int l = 0, r = n-1;
			while(l <= r){
				int mid = l + r >> 1; // (l + r) / 2;
				if(arr[mid] == x){
					return mid; // �ҵ���ֵ�����ظ�Ԫ���±�
				}
				else if(arr[mid] > x){ // midλ���ϵ�Ԫ�ش���x
					r = mid - 1; // ˵��x��mid�����
				}
				else l = mid + 1; // midλ���ϵ�Ԫ��С��x
			}                     // ˵��x��mid���ұ�
			return -1; //û�ҵ�
		}

	
	
	
	
	// �������ֲ���
	
	// ���ֲ���һ�����ڵ���X����Сֵ  
	// �������п�����ȷ����X����Ӱ����������״̬�ĵ�һ��λ�á�
	
	public static int Search(int x){
		int l = 0, r = n-1;
			while(l < r){
				int mid = l + r >> 1; 
				
				// midλ���ϵ�Ԫ��С��x������Ҫ���ҵ��Ǵ��ڵ��ڵ�
				if(arr[mid] < x)
				{ 
					// ����mid������ߵ�ȫ������
					l = mid + 1; 
				}
				else
				{ 
			    //midλ���ϵ�Ԫ�ش��ڵ���x,���ǲ�������,��Ҫ����ƫ��,������r=mid
				r = mid; 
				}
				
			}                 
			return l; 
		}

}
