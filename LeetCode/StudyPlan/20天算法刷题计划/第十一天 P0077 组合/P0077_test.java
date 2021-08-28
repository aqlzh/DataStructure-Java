package leetcodePlan;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P0077_test {

	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(n, k, 1, path, res);
        return res;
    }

    private static void dfs(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> res) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));      // 在结果集合中 添加
            return;
        }
        for (int i = begin; i <= n; i++) {
            path.addLast(i);
            System.out.println("递归之前 => " + path);
            dfs(n, k, i + 1, path, res);
            path.removeLast();     
            System.out.println("递归之后 => " + path);
        }
    }

    public static void main(String[] args) {
  
//        int n = 5;
//        int k = 3;
    	
    	
    	 int n = 4 ;
    	 int k = 2 ;
        List<List<Integer>> res = P0077_test.combine(n, k);
        System.out.println(res);
    }

 
}
