package luoguTest;

import java.util.Arrays;
import java.util.Scanner;

public class P1085 {

	public static void main(String[] args) {
		
	        
			// 存储数据    数组形式
			Scanner sc = new Scanner(System.in);
			int[][] a = new int[2][7]; //建立一个7行2列的二维数组
			for(int i = 0;i < 7;i++) { //给二维数组输入数据
				for(int j = 0;j < 2;j++) {
					a[j][i] = sc.nextInt();
				}
			}
			
			// 下面是判断语句
			int[] b = new int[7]; //创建一个数组来存储加和 并 按升序排列
			int[] c = new int[7]; //创建一个数组来储存原来的数据（以用来查询下标）
			
			
			for(int i = 0;i < 7;i++) { //计算各行数据相加的大小并赋值给数组b c
				b[i] = a[0][i] + a[1][i];
				c[i] = a[0][i] + a[1][i];
				//两种在后面不同用途的数组
			}
			
			boolean flag = false;
			for(int i = 0;i < 7;i++) {
				if(b[i] > 8) { //判断其存不存在不高兴的一天（加和大于8）
					flag = true;
				}
			}
			
			if(flag) { //如果存在不高兴
				int day= 0 ;
				Arrays.sort(b); //将b数组内元素进行升序排列
				for(int i = 0;i < 7;i++) {
					if(b[6] == c[i]) {    // 因为升序后 b[6]   最大   第一个最大
						day = i+1;
						break; //根据题意，输出靠前的一天，故打破循环
					}
				}
				System.out.println(day);
			}else {
				System.out.println(0);
			}
		}

	
}

