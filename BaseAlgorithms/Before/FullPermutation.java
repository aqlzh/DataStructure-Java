package BaseFunction;

import java.util.Stack;

/** 
 * @author LZH.create
 *    ���� java  ʵ��ȫ���� 
 */
public class FullPermutation {

	public static void main(String[] args) {
        perm(new int[]{1,2,3},new Stack<>());
    }
    public static void perm(int[] array, Stack<Integer> stack) {
        if(array.length <= 0) {
        	//������Ҷ�ӽڵ㣬���ջ������
            System.out.println(stack);
        } else {
            for (int i = 0; i < array.length; i++) {
            	//tmepArray��һ����ʱ���飬���ھ���Ri
            	//eg��1��2��3��ȫ���У���ȡ��1����ô��ʱtempArray�о���2��3
                int[] tempArray = new int[array.length-1];
                System.arraycopy(array,0,tempArray,0,i);
                System.arraycopy(array,i+1,tempArray,i,array.length-i-1);
                stack.push(array[i]);
                perm(tempArray,stack);
                stack.pop();
            }
        }
    }

}
