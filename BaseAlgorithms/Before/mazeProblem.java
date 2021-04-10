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
				
				Node1 node1 = stack1.pop();  // 出栈
				
				int a=node1.father_x;
				int b=node1.father_y; 
				
				System.out.println(""+node1.row+"-"+node1.column);    // 输出当前行与列
				
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
				stack1.push(new Node1(temp1,temp2,m,n));   // 入栈
				dfs(temp1,temp2,rounds+1);//递归
			}
			data[m][n]=1;   //回溯
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
