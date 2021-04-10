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
					return false ;
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
