package leetcodePlan.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class P0056 {

	public static void main(String[] args) {
		int [][] intervals = {{1,3},{2,6},{8,10},{15,18}} ;
	    int [][] res = fun(intervals) ;
	    int [][] res1 = fun(intervals) ;
	    
	    for(int i =0 ; i < res.length ;i++) {
	    	for(int j =0 ; j <res[0].length ;j++) {
	    		System.out.print(res[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    
	    
	    for(int i =0 ; i < res1.length ;i++) {
	    	for(int j =0 ; j <res1[0].length ;j++) {
	    		System.out.print(res1[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	}
	
	
	public static int [][] fun(int [][] intervals){
		
		// 重写方法，按照区间左边的值进行排序
		Arrays.sort(intervals , new Comparator<int[]>(){
			@Override
			public int compare(int [] o1,int [] o2) {
				return o1[0] - o2[0] ; 
			}
		}) ;
		
		// 初始化 outputs ,用于存储区间合并的动态数组
	    ArrayList<int[]> outputs = new ArrayList<>() ;	
        // 遍历处理每一区间
	    for(int i =0 ; i < intervals.length ;i++) {
	    	int [] currInterval = intervals[i] ;
	    	if(outputs.isEmpty()) {   // 是第一个元素
	    		outputs.add(currInterval) ;
 	    	} else {   // 进行判断是否有重叠
 	    		int [] outputsLastInterval = outputs.get(outputs.size() - 1) ;
 	    		int outputsRight =  outputsLastInterval[1] ;
 	    		int currLeft = currInterval[0] ;
 	    		
 	    		if(outputsRight < currLeft) {  // 没有重叠
 	    			outputs.add(currInterval) ;
 	    		} else {
 	    			int currRight = currInterval[1] ;
 	    			outputsLastInterval[1] = Math.max(outputsRight, currRight) ;
 	    			// 取最大值的原因在于可能存在包含的情况
 	    		}
 	    	}
	    }
	    return outputs.toArray(new int[outputs.size()][]) ;
	    
	}
	
	
	public static int[][] fun2(int[][] intervals){
		List<int []> res = new LinkedList<>() ;
		Arrays.sort(intervals,(o1,o2) -> Integer.compare(o1[0], o2[0]));   // 按照右区间进行排序
		
		int start = intervals[0][0] ;
		for(int i = 1 ; i< intervals.length ;i++) {
			if(intervals[i][0] > intervals[i-1][0]) {   // 没有交集
				res.add(new int[] {start,intervals[i-1][1]});
				start = intervals[i][0] ;
			} else {
				intervals[i][1] = Math.max(intervals[i][1], intervals[i-1][1]) ;
			}
		}
		res.add(new int[] {start,intervals[intervals.length-1][1]}) ;
		return res.toArray(new int[res.size()][]) ;
	}

}
