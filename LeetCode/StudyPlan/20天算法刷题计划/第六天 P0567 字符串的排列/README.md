@[toc]

# [题目](https://leetcode-cn.com/problems/permutation-in-string/)
- 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。

- 换句话说，s1 的排列之一是 s2 的 子串 。


示例 1：

```bash
输入：s1 = "ab" s2 = "eidbaooo"
输出：true
解释：s2 包含 s1 的排列之一 ("ba").
```

示例 2：

```bash
输入：s1= "ab" s2 = "eidboaoo"
输出：false
```

# 题解
- 关键在于当两个字符串`每个字符`的`个数`均相等时，一个字符串才是另一个字符串的排列。
- 根据这一特点，利用滑动窗口，在窗口内依次进行统计`字符`及其`个数`
- 设定两个数组 cnt1,cnt2
- 我们可以使用一个固定长度为 n 的滑动窗口来维护 cnt2，滑动窗口每向右滑动一次，就多统计一次进入窗口的字符，少统计一次离开窗口的字符


# 代码

```java
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) {
            return false;
        }
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < n; ++i) {
            ++cnt1[s1.charAt(i) - 'a'];
            ++cnt2[s2.charAt(i) - 'a'];
        }
        if (Arrays.equals(cnt1, cnt2)) {
            return true;
        }
        for (int i = n; i < m; ++i) {
            ++cnt2[s2.charAt(i) - 'a'];
            --cnt2[s2.charAt(i - n) - 'a'];
            if (Arrays.equals(cnt1, cnt2)) {
                return true;
            }
        }
        return false;
    }
}


```

