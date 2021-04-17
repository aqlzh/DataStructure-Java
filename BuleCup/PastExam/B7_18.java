package PastExam;

import java.util.Scanner;

/**
 * @author LZH.create
 *  第九届 蓝桥杯 第七题  螺旋折线
 *      题解 ： 可以发现规律   在纸上列出关系式
 *       
 */
public class B7_18 {

	 static int[][] next = {{-1,0},{0,1},{1,0},{0,-1}};  //方向数组: 左 上 右 下
	    public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        int endX = sc.nextInt();
	        int endY = sc.nextInt();
	        int count =0;
	        int x = 0;
	        int y = 0;
	        int dir = 0;
	        while(x != endX || y != endY){
	            if (y == -x && x >= 0){
	                dir = 0;// 左
	            }
	            if(y == x + 1 && x < 0){
	                dir = 1;// 上
	            }
	            if (y == -x && x < 0){
	                dir = 2;// 右
	            }
	            if (x == y && x > 0){
	                dir = 3;// 下
	            }
	            x += next[dir][0];
	            y += next[dir][1];
	            count ++;
	        }
	        System.out.println(count);
	    }

	
}
