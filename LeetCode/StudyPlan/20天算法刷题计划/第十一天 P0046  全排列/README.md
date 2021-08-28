> 重铸国一荣光，省二义不容辞


@[toc]
- 排列区分顺序，组合不区分顺序
# [题目](https://leetcode-cn.com/problems/permutations/) 


- 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。

示例 1：

```bash
输入：nums = [1,2,3]
输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
```

示例 2：

```bash
输入：nums = [0,1]
输出：[[0,1],[1,0]]
```

示例 3：

```c
输入：nums = [1]
输出：[[1]]
```

 
# 题解
[参考链接](https://leetcode-cn.com/problems/permutations/solution/hui-su-suan-fa-python-dai-ma-java-dai-ma-by-liweiw/)

- **回溯法** ：采用试错的思想，它尝试分步的去解决一个问题。在分步解决问题的过程中，当它通过尝试发现现有的分步答案不能得到有效的正确的解答的时候，它将取消上一步甚至是上几步的计算，再通过其它的可能的分步解答再次尝试寻找问题的答案。回溯法通常用最简单的递归方法来实现，在反复重复上述的步骤后可能出现两种情况：

- 找到一个可能存在的正确的答案；
- 在尝试了所有可能的分步方法后宣告该问题没有答案。


![在这里插入图片描述](https://img-blog.csdnimg.cn/f8b760bfaee248f6a8cce28e99af03e1.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)
- 关键在于，状态变量的设置，以及状态变量的撤销（回溯）回溯=> 栈的运用
- 注意：`res.add(path)`, 这个地方明明只是引用，我们需要的是其中的在某个特定时期的内容，所以一定要进行拷贝

- 变量 `path` 所指向的列表 在深度优先遍历的过程中只有一份 ，深度优先遍历完成以后，回到了根结点，成为空列表。

在 Java 中，参数传递是 `值传递`，对象类型变量在传参的过程中，复制的是变量的地址。这些地址被添加到 res 变量，但实际上指向的是同一块内存地址， 

修改的部分：

```java
if (depth == len) {
    res.add(new ArrayList<>(path));
    return;
}
```

 - 这里的添加是指添加 `path` 的引用，在深度优先遍历完成后，成为空列表，返回到根节点。所以要写成对 的拷贝。具体的做法为  `new ArrayList<>()`


# 代码

```java
package leetcodePlan;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P0046 {


	    public static List<List<Integer>> permute(int[] nums) {
	        int len = nums.length;
	        // 使用一个动态数组保存所有可能的全排列
	        List<List<Integer>> res = new ArrayList<>();
	        if (len == 0) {
	            return res;
	        }

	        boolean[] used = new boolean[len];
	        Deque<Integer> path = new ArrayDeque<>(len);

	        dfs(nums, len, 0, path, used, res);
	        return res;
	    }

	    private static void dfs(int[] nums, int len, int depth,
	                     Deque<Integer> path, boolean[] used,
	                     List<List<Integer>> res) {
	    	
	    	
	        if (depth == len) {
	            res.add(new ArrayList<>(path));
	            return;
	        }

	        for (int i = 0; i < len; i++) {
	            if (!used[i]) {
	                path.addLast(nums[i]);
	                used[i] = true;

	                System.out.println("  递归之前 => " + path);
	                dfs(nums, len, depth + 1, path, used, res);

	                used[i] = false;
	                path.removeLast();
	                System.out.println("递归之后 => " + path);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3};
	        Solution solution = new Solution();
	        List<List<Integer>> lists = P0046.permute(nums);
	        System.out.println(lists);
	    }
 

 
}

```


- 关于 path 的实例化说明，因为 path  实际上是一个栈，在Java 的官方文档中推荐使用 Deque 进行实例化，`Deque<Integer> path = new ArrayDeque<>(len);`
