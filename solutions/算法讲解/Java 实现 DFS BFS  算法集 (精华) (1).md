> 永远相信美好的事即将发生  ！


:smile: 
@[toc]

[参考链接DFS](https://www.cnblogs.com/handsomelixinan/p/10346065.html)

[参考链接BFS](https://www.cnblogs.com/handsomelixinan/p/10348610.html)

# DFS  (深度优先算法)
## 概念
- DFS（Depth-First-Search，深度优先搜索），顾名思义总是选择深度大的节点去访问
- 树的深度优先 遍历    

- 先根遍历    后根遍历

- 下图二叉树，如果从头结点F开始深度优先遍历，若访问了C则下一个节点不可能是E，因为C和E的深度是一样的，违反深度优先原则。

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210408162231717.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)

- 深度优先遍历序列不唯一

## 模板

```java
public void dfs(int m,int n,int rounds) {//m n 分别为 当前点 横坐标和纵坐标
  if(m==4 && n==4) {
  输出路径和步数
  }
  if(数字1){//可访问
  将数字1变为数字0//访问过不再访问
  判断上下左右能否访问，若能 dfs（）递归调用
  回溯（将数字0变为数字1）
  }
}

```

## DFS  算法运用
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210407091104662.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)

```java
package BaseFunction;

public class islands {

	
	public static void main(String [] args) {
		
		char [][] grid = {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','1'}
		} ;

		
		
		System.out.println(numIslands(grid));
	}
	
    public static int numIslands(char[][] grid) {
        int res = 0 ;
        for(int i = 0 ; i < grid.length ; i ++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(grid[i][j] == '1') //找到为1的陆地，调用DFS使之变成大海
                {
                    res ++ ; //记录调用的次数
                    dfs(i,j,grid) ;
                }
            }
        }
        
        return res ;
       
       
        
    }
    
    
    public static void dfs(int i , int j ,char[][] grid) //grid为输入的二维数组，i，j为小蛇的位置
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') //“撞南墙”
            return ;
        grid[i][j] = '0' ; //记录节点轨迹，这里的记录方法非常巧妙，将访问之后的陆地变成水，小蛇自然不会再去访问了
        dfs(i+1,j,grid); //递归调用，来控制小蛇的方向：左右上下
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);
    }

}

```

好像 `dfs()`  下还有 `dfs()`  即为 上下左右实现  没有回溯

==注意==： 先将 `dfs(i+1,j,grid);`  递归调用完 类似于递归调用树，一直调用到最后的根结点
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210407094546113.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)

## 回溯法（八皇后问题） 

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210407090730142.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)

```java
package BaseFunction;

public class Queue8 {

	   // 定义一个max表示共有多少个皇后
	
		int max = 8;
		
		// 定义一个array，保存皇后放置位置的结果，比如arr= {0,4,7,5,2,6,1,3}
		int[] array = new int[max];
		static int count = 0;
		static int judgeCount = 0;

		public static void main(String[] args) {
			// 测试八皇后
			Queue8 queue8 = new Queue8();
			queue8.check(0);
			System.out.println("一共有" + count + "解法");
			System.out.println("一共判断冲突" + judgeCount + "次");
		}

		// 方法：放置第n个皇后
		// 特别注意：check是每一次递归时，进入到check中都有for (int i = 0; i < max; i++),因此产生回溯
		private void check(int n) {
			if (n == max) {// n=8,八个皇后就已经放好了
				print();
				return;
			}
			// 依次放入皇后，并判断是否冲突
			for (int i = 0; i < max; i++) {
				// 先把当前皇后，放到该行的第一列
				array[n] = i;
				// 判断当放置第n个皇后到i列时，是否冲突
				if (judge(n)) {// 不冲突
					// 接着放n+1个皇后，即开始递归
					check(n + 1);
				}
				// 如果冲突，就继续执行array[n]=i;即将第n个皇后，放置在本行的后移的一个位置
			}
		}

		// 查看当我们放置第n个皇后，就去检测该皇后是否和前面已经摆放的皇后冲突
		/**
		 * @param n 表示第n个皇后
		 * @return
		 */
		private boolean judge(int n) {
			judgeCount++;
			for (int i = 0; i < n; i++) {
				// 说明：
				// 1.array[i] == array[n] 判断是否在同一列
				// 2.Math.abs(n - i) == Math.abs(array[n] - array[i]) 判断是否在同一斜线
				// 3.判断是否在通一行，没有必要，n每次都在递增。
				if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
					return false;
				}
			}
			return true;
		}

		// 先写一个方法可以将皇后摆放的位置输出
		private void print() {
			count++;
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}

}

```
## 分配口罩

- 某市市长获得了若干批口罩，每一批口罩的数目如下：

9090400

8499400

5926800

8547000

4958200

4422600

5751200

4175600

6309600

5865200

6604400

4635000

10663400

8087200

4554000

- 现在市长要把口罩分配给市内的 2 所医院。由于物流限制，每一批口罩只能全部分配给其中一家医院。市长希望 2 所医院获得的口罩总数之差越小越好。
- 请你计算这个差最小是多少？

### 解题思路
- 解题思路：

> 本题是一个典型的递归问题（多路径问题）
>  dfs函数的三个参数分别为 k、sum1、sum2 k代表正在处理数字的下标
> sum1为1号医院的口罩数量 
> sum2位2号医院的口罩数量 
> 当k=15时，说明所有口罩全部分配完成，此时要确定最小值和当前两个医院数量的差值
> 函数体中处理的是不同路径 第一个是给1号医院分配 第二个是给2号医院分配经过多次递归回溯，会计算出所有分配情况的最小值

运用递归方法  --> 二叉树


```java
package PastExam;

public class B4_20 {
     

		public static long res=Long.MAX_VALUE;
		
		public static long num[]={9090400, 8499400, 5926800, 8547000, 4958200,
				   				  4422600, 5751200, 4175600, 6309600, 5865200, 
				   				  6604400, 4635000, 10663400, 8087200, 4554000
								}; 
	    public static void main(String[] args){
	    	dfs(0, 0, 0);
	    	System.out.println(res);
		}
	    public static void dfs(int k,long sum1,long sum2 ) {
	    	if(k==15) {
	    		res=res<Math.abs(sum1-sum2)?res:Math.abs(sum1-sum2);
	    		return;
	    	}
	    	dfs(k+1, sum1+num[k], sum2);
	    	dfs(k+1, sum1, sum2+num[k]);
	    }
	

}

```
![在这里插入图片描述](https://img-blog.csdnimg.cn/202104071042238.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)



# BFS（广度优先算法）
- BFS（Breadth First Search，宽度优先搜索），
- 树为一种特殊的图         --------->     树的广度优先算法（层序遍历）
- 层序遍历 （实现原理）  --->   借助队列实现

- 最短路径问题

- 下图二叉树，如果从头结点F开始深度优先遍历，若访问了C则下一个节点一定是E，由于先访问的结点C所以接下来访问的一定是C的子节点。

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210408162231717.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)
- 宽度优先遍历序列不唯一



## 模板

```java
public void bfs(int m,int n) {//m n 分别为 目标点 横坐标和纵坐标
起点入队
while（队不为空）{
出队
若到目标点->输出步数
判断上下左右能否访问，若能则入队
}
输出路径
}

```

## BFS  算法运用
还是这一题哈，不过是运用  BFS  算法哈~
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210407091104662.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)
```java
package BaseFunction;

import java.util.LinkedList;
import java.util.Queue;

public class islands_BFS {

	// 层序遍历   --->  队列
	
	public static void main(String [] args) {
		
		char [][] grid = {
				{'1','1','1','1','0'},    // 4 x 5 
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','1'}
		} ;

		
		
		System.out.println(numIslands(grid));
	}
	
    public static  int numIslands(char [][] grid) {
    	Queue<Integer> queue = new LinkedList<Integer>() ;
        int num = 0 ;
        for(int i = 0 ; i < grid.length ; i ++)
        {
            for(int j = 0 ; j < grid[0].length ; j ++)
            {
                if(grid[i][j] == '1')
                {
                    bfs(i,j,queue,grid) ;
                    num ++ ;
                }
            }
        }
        return num ;
    	
    }
    
    
    // #  46  55，56   编码与解码
    public static void bfs(int p , int q , Queue<Integer> queue,char[][] grid){
    	int m  = grid.length ;
    	int n  = grid[0].length ;
    	
    	int t  = Math.max(m, n) ;
    	int w  = p*t + q ;   // 将二维数组编译为 一维数组  将其连为一串     
    	
    	queue.offer(w) ;  // 添加
    	grid[p][q] = '0' ;
    	
    	while(!queue.isEmpty()) {
    		int s  = queue.poll() ;   // 检索头  由于所需要解决的问题不在于求最短路径，而在于遍历，使用没有记录步数
    		int i = s/t ;
    		int j = s%t ;
    		
    		if(i + 1 < m && grid[i+1][j] != '0') {    // 上
    			 queue.offer((i+1)*t + j);
                 grid[i+1][j] = '0';
    		}
    		
    		
    		if(i - 1 >= 0 && grid[i-1][j] != '0') {   // 下
   			 queue.offer((i-1)*t + j);
                grid[i-1][j] = '0';
   		    }
    		
    		
    		if(j - 1 >= 0 && grid[i][j-1] != '0')  // 　　　　　　//左
            {
                queue.offer(i*t + j-1);
                grid[i][j-1] = '0';
            }
            if(j + 1 < n && grid[i][j+1] != '0')    // 　　　　　　//右
            {
                queue.offer(i*t + j+1);
                grid[i][j+1] = '0';
            }
    			  	
         
      }


    }
    
 }
    	

```


# 迷宫问题 运用
![在这里插入图片描述](https://img-blog.csdnimg.cn/2021040816172595.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)
## DFS + BFS  求解

- 输入一堆字符串 转化为  二维数组  方法 

```java
	Scanner s = new Scanner(System.in);
		
		/*
		 10000
		 10111
		 11101
		 00001
		 00001
		 */
		
		for(int i=0;i<5;i++) {
			String ss = s.nextLine();
			for(int j=0;j<5;j++) {
				data[i][j]=Integer.parseInt(ss.charAt(j)+"");
			}
		}
```

  

:cry:  好难理解鸭
```java
package BaseFunction;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author LZH.create
  *  运用 DFS  BFS  解决迷宫问题  
  *  pop 出栈    ；   push  入栈
 */
public class mazeProblem {
 
	private static int data[][] = new int[5][5];
	private Stack<Node1> stack1 = new Stack<Node1>();
	private List<Node1> list = new ArrayList<Node1>();//存储dfs第一条到达目标点的路径
	private boolean flag=true;// 辅助判断 存储dfs第一条到达目标点的路径
	private int next[][] = { { 0, 1 }, { 1, 0 } ,{0,-1},{-1,0}};// 4个方向
	
	class Node {//bfs
		
		int row;
		int column;
		int father_x;
		int father_y;
		int round;
 
		public Node(int row, int column,int father_x, int father_y,  int round) {
			super();
			this.row = row;
			this.column = column;
			this.father_x= father_x;
			this.father_y = father_y;
			this.round = round;
		}
 
	}
	
	class Node1{//dfs
		int row;
		int column;
		int father_x;
		int father_y;
		
		public Node1(int row, int column,int father_x, int father_y) {
			super();
			this.row = row;
			this.column = column;
			this.father_x= father_x;
			this.father_y = father_y;
		}
	}
	
	public void dfs(int m,int n,int rounds) {//m n 分别为 当前点 横坐标和纵坐标
		if(m==4 && n==4) {

			if(flag) {//flag: 第一个出口路线
				Node1 node1 = stack1.pop();
				int a=node1.father_x;
				int b=node1.father_y;
				System.out.println(""+node1.row+"-"+node1.column);
				
				while(!stack1.isEmpty()) {
					Node1 node3 = stack1.pop();
					if(node3.row==a && node3.column==b) {
						System.out.println(""+node3.row+"-"+node3.column);
						a=node3.father_x;
						b=node3.father_y;
					}
				}
				//System.out.println(""+0+"-"+0);
			}else {
				Node1 node1 = stack1.pop();
				int a=node1.father_x;
				int b=node1.father_y;
				int t=0;
				System.out.println(""+node1.row+"-"+node1.column);
				
				while(!stack1.isEmpty()) {
					Node1 node3 = stack1.pop();
					if(node3.row==a && node3.column==b) {
						System.out.println(""+node3.row+"-"+node3.column);
						a=node3.father_x;
						b=node3.father_y;
					}
				}
				
				//寻找第一个分叉点
				for(int i=0;i<list.size();i++) {
					if(list.get(i).row==a && list.get(i).column==b) {
						t=i;
						break;
					}
				}
				//输出分叉点前的点
				for(int i=t;i>=0;i--) {
					System.out.println(list.get(i).row+"-"+list.get(i).column);
				}
				
			}
			
			System.out.println(rounds);
			flag=false;
		}
		
		
		
		
		
		if(data[m][n]==1) {
			data[m][n]=0;
			//stack1.push(new Node1(m,n));
			for(int i=0;i<4;i++) {
				int temp1 = m+next[i][0];
				int temp2 = n+next[i][1];
				
				if(temp1>4 || temp2>4 || temp1<0 || temp2<0 ||data[temp1][temp2]==0) {
					continue;
				}
				if(flag) {
					list.add(new Node1(temp1,temp2,m,n));
				}
				stack1.push(new Node1(temp1,temp2,m,n));
				dfs(temp1,temp2,rounds+1);//递归
			}
			data[m][n]=1;//回溯
		}
	}
	
	public void bfs(int m,int n) {//m n 分别为 目标点 横坐标和纵坐标
		Queue<Node> queue = new LinkedList<>();
		Node node1 = new Node(0, 0,-1,-1, 0);
		Stack<Node> stack = new Stack<Node>();//存访问过的结点
		
		queue.offer(node1);
		while(!queue.isEmpty()) {
			Node node2 = queue.poll();
			stack.push(node2);
			
			if(node2.row==m && node2.column==n) {
				System.out.println(node2.round);
				break;
			}
			
			for(int i=0;i<4;i++) {
				int temp1 = node2.row+next[i][0];
				int temp2 = node2.column+next[i][1];
				
				if(temp1>4 || temp2>4 || temp1<0 || temp2<0 ||data[temp1][temp2]==0) {
					continue;
				}
					
				data[temp1][temp2]=0;
				queue.offer(new Node(temp1,temp2,node2.row,node2.column,node2.round+1));
			}
			
		}
		
		Node node = stack.pop();
		int a=node.father_x;
		int b=node.father_y;
		System.out.println(""+node.row+"-"+node.column);
		
		while(!stack.isEmpty()) {
			Node node3 = stack.pop();
			if(node3.row==a && node3.column==b) {
				System.out.println(""+node3.row+"-"+node3.column);
				a=node3.father_x;
				b=node3.father_y;
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		/*
		 10000
		 10111
		 11101
		 00001
		 00001
		 */
		
		for(int i=0;i<5;i++) {
			String ss = s.nextLine();
			for(int j=0;j<5;j++) {
				data[i][j]=Integer.parseInt(ss.charAt(j)+"");
			}
		}
		
		
		//new mazeProblem().bfs(4,4);
		new mazeProblem().dfs(0,0,0);
	}

}

```

