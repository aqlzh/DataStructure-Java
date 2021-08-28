@[toc]

# 剪枝算法概述
 - **基本概念** ： 在搜索算法中优化中，剪枝，就是通过某种判断，避免一些不必要的遍历过程，形象的说，就是剪去了搜索树中的某些“枝条”，故称剪枝。应用剪枝优化的核心问题是设计剪枝判断方法，即确定哪些枝条应当舍弃，哪些枝条应当保留的方法。
- **剪枝的三个原则**：正确、准确、高效
- **剪枝的两种思路**:可行性剪枝及最优性剪枝
- **剪枝算法按照其判断思路可大致分成两类** : 可行性剪枝及最优性剪枝 .
- **剪枝策略** ： 属于算法优化范畴；通常应用在DFS 和 BFS 搜索算法中；剪枝策略就是寻找过滤条件，提前减少不必要的搜索路径。



# [题目](https://leetcode-cn.com/problems/combinations/)


- 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。

- 你可以按 任何顺序 返回答案。


示例 1：

```bash
输入：n = 4, k = 2
输出：
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
```

示例 2：

```bash
输入：n = 1, k = 1
输出：[[1]]
```
#  题解

## 实现思路
- 既然是树形问题上的 深度优先遍历，因此首先画出树形结构。例如输入：n = 4, k = 2，我们可以发现如下递归结构：

![在这里插入图片描述](https://img-blog.csdnimg.cn/9578ecf952214dfaa65f0d6805695e00.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)


- 如果组合里有 1 ，那么需要在 [2, 3, 4] 里再找 1 个数；
- 如果组合里有 2 ，那么需要在 [3, 4] 里再找 1个数。
- ==注意==：这里不能再考虑 1，因为包含 1 的组合，在第 1 种情况中已经包含。

- 数据结构： 因为组合的数目不定，故选择链表存储  `List<>`  

<font color=red>**注意**</font>： 

- 叶子结点的信息体现在从根结点到叶子结点的`路径`上，因此需要一个表示路径的变量 path，它是一个列表，特别地，path 是一个**栈**；
- 每一个结点递归地在做同样的事情，区别在于搜索起点，因此需要一个变量 start ，表示在区间 [begin, n] 里选出若干个数的组合；
- 可能有一些分支没有必要执行，我们放在优化中介绍 (剪枝算法的体现)。
## 实现代码

```java
package leetcodePlan;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P0077 {
	 public List<List<Integer>> combine(int n, int k) {
		 
	        List<List<Integer>> res = new ArrayList<>();
	        if (k <= 0 || n < k) {
	            return res;
	        }
	        // 从 1 开始是题目的设定
	        Deque<Integer> path = new ArrayDeque<>();
	        dfs(n, k, 1, path, res);
	        return res;
	    }

	    private void dfs(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> res) {
	        // 递归终止条件是：path 的长度等于 k
	        if (path.size() == k) {
	            res.add(new ArrayList<>(path));
	            return;
	        }

	        // 遍历可能的搜索起点
	        for (int i = begin; i <= n; i++) {
	            // 向路径变量里添加一个数
	            path.addLast(i);
	            // 下一轮搜索，设置的搜索起点要加 1，因为组合数里不允许出现重复的元素
	            dfs(n, k, i + 1, path, res);
	            // 重点理解这里：深度优先遍历有回头的过程，因此递归之前做了什么，递归之后需要做相同操作的逆向操作
	            path.removeLast();
	        }
	    }
}

```


## 剪枝优化
- **剪枝过程分析**：如果 n = 7, k = 4，从 5 开始搜索就已经没有意义了，这是因为：即使把 5 选上，后面的数只有 6 和 7，一共就 3 个候选数，凑不出 4 个数的组合。因此，搜索起点有上界。

![在这里插入图片描述](https://img-blog.csdnimg.cn/2b5795ca62134cd6876aad1f183af278.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

- **公式推导**：
-   假设  n = 6 ，k = 4。
- path.size() = 1 的时候，接下来要选择 33 个数，搜索起点最大是 4，最后一个被选的组合是 [4, 5, 6]；
- path.size() = 2 的时候，接下来要选择 2个数，搜索起点最大是 5，最后一个被选的组合是 [5, 6]；
- path.size() = 3 的时候，接下来要选择 1 个数，搜索起点最大是 6，最后一个被选的组合是 [6]；

再如：n = 15 ，k = 4。

- path.size() = 1 的时候，接下来要选择 3 个数，搜索起点最大是 13，最后一个被选的是 [13, 14, 15]；
- path.size() = 2 的时候，接下来要选择 2 个数，搜索起点最大是 14，最后一个被选的是 [14, 15]；
- path.size() = 3 的时候，接下来要选择 1 个数，搜索起点最大是 15，最后一个被选的是 [15]；

可以归纳出：


```cpp
搜索起点的上界 + 接下来要选择的元素个数 - 1 = n
```

其中，接下来要`选择的元素个数 = k - path.size()`，整理得到：

搜索起点的上界 = n - (k - path.size()) + 1

所以，我们的剪枝过程就是：把 i <= n 改成 i <= n - (k - path.size()) + 1 ：

 

```java
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(n, k, 1, path, res);
        return res;
    }

    private void dfs(int n, int k, int index, Deque<Integer> path, List<List<Integer>> res) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        // 只有这里 i <= n - (k - path.size()) + 1 与参考代码 1 不同
        for (int i = index; i <= n - (k - path.size()) + 1; i++) {
            path.addLast(i);
            dfs(n, k, i + 1, path, res);
            path.removeLast();
        }
    }
}

 
```

