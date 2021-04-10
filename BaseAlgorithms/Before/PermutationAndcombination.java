package BaseFunction;

import java.util.Stack;

public class PermutationAndcombination {
	static int cnt = 0;
    static Stack<Integer> s = new Stack<Integer>();
 
    /**
     * 递归方法，当实际选取的小球数目与要求选取的小球数目相同时，跳出递归
     * @param minv - 小球编号的最小值
     * @param maxv - 小球编号的最大值
     * @param curnum - 当前已经确定的小球的个数  --> 有点类似于 count 计数器的意思
     * @param maxnum - 要选取的小球的数目
     * 3 ^ 4
     */
    public static void kase1(int minv,int maxv,int curnum, int maxnum){
        if(curnum == maxnum){
            cnt++;
            System.out.println(s);
            return;
        }
 
        for(int i = minv; i <= maxv; i++){
        	
            s.push(i);
            kase1(minv, maxv, curnum+1, maxnum);
            s.pop();
        }
    }
 
    public static void main(String[] args){
        kase1(1, 3, 0, 4);
        System.out.println(cnt);
    }



}
