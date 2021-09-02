@[toc]

# [题目](https://leetcode-cn.com/problems/rotate-image/)

- 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。

- 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。

 
示例 1：

![在这里插入图片描述](https://img-blog.csdnimg.cn/36bfc7e08ea14a4f8eac1b4c01fc1be7.png)


```bash
输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
输出：[[7,4,1],[8,5,2],[9,6,3]]
```

 
# 题解
## 解法一（暴力枚举）
- 注意：与题目的输入格式不一样
```java
	public static void fun3(int[][] matrix) {
		for(int i = 0 ; i < matrix[0].length ;i++) {
			for(int j = matrix.length-1 ; j>=0 ;j--) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}
```

## 解法二（交换法）
![在这里插入图片描述](https://img-blog.csdnimg.cn/4ed64e3c49de4f9294293bfb1900f2dd.png)

```java
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        //先上下交换
        for (int i = 0; i < length / 2; i++) {
            int temp[] = matrix[i];
            matrix[i] = matrix[length - i - 1];
            matrix[length - i - 1] = temp;
        }
        //在按照对角线交换
        for (int i = 0; i < length; ++i) {
            for (int j = i + 1; j < length; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

```

