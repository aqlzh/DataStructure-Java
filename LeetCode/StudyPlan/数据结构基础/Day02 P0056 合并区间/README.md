> 半岛铁盒

# [题目](https://leetcode-cn.com/problems/merge-intervals/)

- 以数组 intervals 表示若干个区间的集合，其中单个区间为 `intervals[i] = [starti, endi]` 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。


示例 1：

```bash
输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
输出：[[1,6],[8,10],[15,18]]
解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
```

 

# 题解
## 解法一（排序比较法）
暴力模拟

- 首先按照区间的左值进行排序（重写排序方法）
- 加入新区间时，前后进行比较

```java
package leetcodePlan.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class P0056 {

	public static void main(String[] args) {
		int [][] intervals = {{1,3},{2,6},{8,10},{15,18}} ;
	    int [][] res = fun(intervals) ;
	    
	    for(int i =0 ; i < res.length ;i++) {
	    	for(int j =0 ; j <res[0].length ;j++) {
	    		System.out.print(res[i][j] + " ");
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

}

```

## 解法二 （贪心算法）
- 关于贪心算法（可以参考这篇文章）  [跳转链接](https://blog.csdn.net/QuantumYou/article/details/115640177?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522163049703616780269829223%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fblog.%2522%257D&request_id=163049703616780269829223&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~blog~first_rank_v2~rank_v29-1-115640177.pc_v2_rank_blog_default&utm_term=%E8%B4%AA%E5%BF%83%E7%AE%97%E6%B3%95&spm=1018.2226.3001.4450)


- 按照左边界排序，排序之后局部最优：每次合并都取最大的右边界，这样就可以合并更多的区间了，
- 整体最优：合并所有重叠的区间。
- 局部最优可以推出全局最优
```java
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
```

