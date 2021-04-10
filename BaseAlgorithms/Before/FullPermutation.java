package BaseFunction;

import java.util.Stack;

/** 
 * @author LZH.create
 *    运用 java  实现全排列 
 */
public class FullPermutation {

	public static void main(String[] args) {
        perm(new int[]{1,2,3},new Stack<>());
    }
    public static void perm(int[] array, Stack<Integer> stack) {
        if(array.length <= 0) {
        	//进入了叶子节点，输出栈中内容
            System.out.println(stack);
        } else {
            for (int i = 0; i < array.length; i++) {
            	//tmepArray是一个临时数组，用于就是Ri
            	//eg：1，2，3的全排列，先取出1，那么这时tempArray中就是2，3
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
