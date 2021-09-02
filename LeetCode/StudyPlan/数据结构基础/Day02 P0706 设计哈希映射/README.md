> 尽人力，敬天命
> Always continue; Never break ;


# [题目](https://leetcode-cn.com/problems/design-hashmap/)
- 不使用任何内建的哈希表库设计一个哈希映射（HashMap）。

- 实现 MyHashMap 类：

- `MyHashMap()` 用空映射初始化对象
`void put(int key, int value)` 向 HashMap 插入一个键值对 (key, value) 。如果 key 已经存在于映射中，则更新其对应的值 value 。
`int get(int key)` 返回特定的 key 所映射的 value ；如果映射中不包含 key 的映射，返回 -1 。
`void remove(key)` 如果映射中存在 key 的映射，则移除 key 和它所对应的 value 。
 

示例：

```bash
输入：
["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
输出：
[null, null, null, 1, -1, null, 1, null, -1]
```

```bash
解释：
MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1, 1); // myHashMap 现在为 [[1,1]]
myHashMap.put(2, 2); // myHashMap 现在为 [[1,1], [2,2]]
myHashMap.get(1);    // 返回 1 ，myHashMap 现在为 [[1,1], [2,2]]
myHashMap.get(3);    // 返回 -1（未找到），myHashMap 现在为 [[1,1], [2,2]]
myHashMap.put(2, 1); // myHashMap 现在为 [[1,1], [2,1]]（更新已有的值）
myHashMap.get(2);    // 返回 1 ，myHashMap 现在为 [[1,1], [2,1]]
myHashMap.remove(2); // 删除键为 2 的数据，myHashMap 现在为 [[1,1]]
myHashMap.get(2);    // 返回 -1（未找到），myHashMap 现在为 [[1,1]]
```

# 题解
## 哈希函数常用构造方法： 
   1. 直接定址法：取关键字或关键字的某个线性函数值为哈希地址，`H(key) = a * key + b` ;
   2. 数字分析法
   3. 平方取中法
   4. 折叠法
   5. ==除留余数法==   : 取关键字被某个不大于哈希表表长m 的数 p 除 后所得余数为哈希地址 。`H(key) = key MOD p , (p<m)`

## 解决哈希冲突的方法

 1. 开放地址法   二次探测再散列
 2. 再哈希法
 3. 链地址法
 4. 建立公共溢出区


## 本题解题
- 超大数组法
- 开放寻址
- 拉链法  (如下代码)

### 解法一（拉链法）
```java
class MyHashMap {

    Node[] array;
    int size;

    /** Initialize your data structure here. */
    public MyHashMap() {
        array = new Node[1<<15];//make sure size is powers of 2
        size =0;
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        //factor is 0.75
        if(++size>array.length*0.75){
            //double size
            resize();
        }
        int index = getIndex(key,array.length);
        Node head = array[index];
        Node cur = new Node(key,value);
        
        if(head ==null){// head has not been initialized
            head = new Node();
            array[index] = head;
            head.next = cur;
        }else{
            //cover the old value
            Node h2 = head.next;
            while(h2!=null){
                if(h2.key == key){
                    h2.value = value;
                    return;
                }
                h2 = h2.next;
            }
            h2 = head.next;
            head.next = cur;
            cur.next = h2;
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = getIndex(key,array.length);
        Node head = array[index];
        
        if(head ==null){
            return -1;//not found
        }else{
            Node h2 = head.next;
            while(h2!=null){
                if(h2.key == key){
                    return h2.value;
                }
                h2 = h2.next;
            }
            return -1;//not found
        }

    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = getIndex(key,array.length);
        Node head = array[index];
        
        if(head==null){//not found
            return;
        }else{
            Node pre = head;
            Node h2 = head.next;
            while(h2!=null){
                if(h2.key!=key){
                    pre = h2;
                    h2 = h2.next;
                }else{
                    pre.next = h2.next;
                    size--;
                    return;
                }
            }
        }
    }
     private void resize(){
        //double size
        Node[] array2 = new Node[array.length<<1];
        //transfer node from old bin into new bin
        for(int i=0;i<array.length;i++){
            Node head1 = array[i];
            if(head1!=null){
                Node h1 = head1.next;
                while(h1!=null){
                    Node next = h1.next;
                    int key = h1.key;
                    int newIndex = getIndex(key,array2.length);
                    Node head2 = array2[newIndex];
                    if(head2==null){
                        head2 = new Node();
                        head2.next = h1;
                        array2[newIndex]=head2;
                    }else{
                        Node temp = head2.next;
                        head2.next = h1;
                        h1.next = temp;
                    }
                    h1 = next;
                }
            }
        }
        array = array2;
    }

    //make sure size is powers of 2
    //then key%size = key&(size-1)
    private int getIndex(int key,int size){
        return key&(size-1);
    }

    class Node{

        int key;
        int value;
        Node next;

        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
        public Node(){
        }
    }
}
```

- 优化  `key%size = key&(size-1)`  解释： 如 `5%8` 只能有 `0 ~7` 种结果，即为 `size - 1`      注意要求：后者比前者大

### 解法二（超大数组）

```java
class MyHashMap {
    int INF = Integer.MAX_VALUE;
    int N = 1000009;
    int[] map = new int[N];
    public MyHashMap() {
        Arrays.fill(map, INF);
    }
    
    public void put(int key, int value) {
        map[key] = value;
    }
    
    public int get(int key) {
        return map[key] == INF ? -1 : map[key];
    }
    
    public void remove(int key) {
        map[key] = INF;
    }
}

```

### 解法三（开放地址法）

```java
class MyHashMap {
    static class Node {
        int key, value;
        Node next;
        boolean isDeleted;
        Node(int _key, int _value) {
            key = _key;
            value = _value;
        }
    }
    
    // 冲突时的偏移量
    int OFFSET = 1;
    Node[] nodes = new Node[10009];

    public void put(int key, int value) {
        int idx = getIndex(key);
        Node node = nodes[idx];
        if (node != null) {
            node.value = value;
            node.isDeleted = false;
        } else {
            node = new Node(key, value);
            nodes[idx] = node;
        }
    }

    public void remove(int key) {
        Node node = nodes[getIndex(key)];
        if (node != null) node.isDeleted = true;
    }

    public int get(int key) {
        Node node = nodes[getIndex(key)];
        if (node == null) return -1;
        return node.isDeleted ? -1 : node.value;
    }
    
    // 当 map 中没有 key 的时候，getIndex 总是返回一个空位置
    // 当 map 中包含 key 的时候，getIndex 总是返回 key 所在的位置
    int getIndex(int key) {
        int hash = Integer.hashCode(key);
        hash ^= (hash >>> 16);
        int n = nodes.length;
        int idx = hash % n;
        while (nodes[idx] != null && nodes[idx].key != key) {
            hash += OFFSET;
            idx = hash % n;
        }
        return idx;
    }
}

 
```

