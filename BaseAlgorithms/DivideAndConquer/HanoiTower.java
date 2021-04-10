package Algorithm;

/**
 * @author LZH.create
 *    使用分治法  解决汉诺塔问题
 */
public class HanoiTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoiTower(3, 'A', 'B', 'C');
	}
	
	
	// 将 n 个盘子 从 A 塔 借助于 B塔 移动 到 C 塔
	
	// ☆☆☆☆  重要    以下  a b c 分别代表              初始柱    中站柱    最终柱
	public static void hanoiTower(int num ,char a,char b ,char c) {
	    // 递归终止条件
		if(num == 1) {
			System.out.println("第1个盘从 " + a + "-->" + c) ;
		} else {
			//如果我们有 n >= 2 情况，我们总是可以看做是两个盘 1.最下边的一个盘 2. 上面的所有盘
			//1. 先把 最上面的所有盘 A->B， 移动过程会使用到 c
			hanoiTower(num - 1, a, c, b);
			
			
			//2. 把最下边的盘 A->C
			System.out.println("第" + num + "个盘从 " + a + "-->" + c);
			
			
			//3. 把B塔的所有盘 从 B->C , 移动过程使用到 a塔  
			hanoiTower(num - 1, b, a, c);
			
		}
		
		
	}

}
