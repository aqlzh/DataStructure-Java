package BaseFunction;

import java.util.Stack;

public class PermutationAndcombination {
	static int cnt = 0;
    static Stack<Integer> s = new Stack<Integer>();
 
    /**
     * �ݹ鷽������ʵ��ѡȡ��С����Ŀ��Ҫ��ѡȡ��С����Ŀ��ͬʱ�������ݹ�
     * @param minv - С���ŵ���Сֵ
     * @param maxv - С���ŵ����ֵ
     * @param curnum - ��ǰ�Ѿ�ȷ����С��ĸ���  --> �е������� count ����������˼
     * @param maxnum - Ҫѡȡ��С�����Ŀ
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
