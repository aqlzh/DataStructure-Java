> Always continue; Never break ;

@[toc]

# [题目](https://leetcode-cn.com/problems/pascals-triangle-ii/)
- 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。

- 在「杨辉三角」中，每个数是它左上方和右上方的数的和。

![](https://img-blog.csdnimg.cn/img_convert/53cb4e7f630b8a991ebd02133e79a9c8.gif)

示例 1:

```bash
输入: rowIndex = 3
输出: [1,3,3,1]
```

 
# 题解
## 杨辉三角的性质
![在这里插入图片描述](https://img-blog.csdnimg.cn/f05c3d1819c14f59a254d842aba8d291.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)


## 解法一（动态规划）
- 根据杨辉三角形后一行与前一行的关系。

- 如下图，外层循环从上往下一层层求，复用一维数组 res（滚动数组），计算每个位置上的元素，只取决于上一行的值。

- 内层遍历的递推式为`res[j] = res[j] + res[j-1]`，要保证等号右边的两个，是上一行的“旧值”。
- 如果内层遍历是从左往右，会出现res[j-1]是本行的上一轮迭代求出的新值，不是上一行的旧值。
 
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/292ee8c94f3b4f92826c85b4b9595c64.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

```cpp
class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> kRows(rowIndex+1);//第K行的vector大小为 rowIndex+1
        for(int i = 0; i <= rowIndex; i++)//利用前一行求后一行，第K行要循环K遍
            {
            kRows[i] = 1;//行末尾为1
            for(int j = i; j > 1; j--)//每一行的更新过程
                {
                    kRows[j-1] = kRows[j-2] + kRows[j-1];
                }
            }
        return kRows;   
    }
};

```

## 解法二（递推）

- 利用杨辉三角的上述性质4，可以递归得出

```java
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> C = new ArrayList<List<Integer>>();
        for (int i = 0; i <= rowIndex; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(C.get(i - 1).get(j - 1) + C.get(i - 1).get(j));
                }
            }
            C.add(row);
        }
        return C.get(rowIndex);
    }
}

```

