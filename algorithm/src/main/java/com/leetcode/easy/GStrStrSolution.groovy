package com.leetcode.easy

class GStrStrSolution {
    private static int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0
        }
        // 得到next数组
        int[] next = getNextArr(needle)
        // i是匹配串haystack的指针，j是模式串needle的指针
        int i = 0, j = 0
        // 双指针开始匹配
        while(i < haystack.length() && j < needle.length()){
            // 如果j=-1意味着刚刚失配过，下标+1后，下一轮就可以开始匹配各自的第一个了
            // 如果指向的字母相同，则下一轮匹配各自的下一个
            if(j == -1 || haystack.charAt(i) == needle.charAt(j)){
                i++
                j++
                // 如果失配，则将更新j为next[j]
            } else {
                j = next[j]
            }
        }
        return j == needle.length() ? i - j : -1
    }

    private static int[] getNextArr(String needle){
        int[] next = new int[needle.length()]
        // k是前缀中相同部分的末尾，同时也是相同部分的长度，因为长度等于k-0。
        // j是后缀的末尾，即后缀相同部分的末尾
        int k = -1, j = 0
        next[0] = -1
        while(j < needle.length() - 1){
            // 如果k=-1，说明刚刚失配了，则重新开始计算前缀和后缀相同的长度
            // 如果两个字符相等，则在上次前缀和后缀相同的长度加1就行了
            if (k == -1 || needle.charAt(j) == needle.charAt(k)){
                k++
                j++
                next[j] = k
            } else {
                // 否则，前缀长度缩短为next[k]
                k = next[k]
            }
        }
        return next
    }

    public static void main(String[] args) {
        int str = strStr("hello", "ll");
        System.out.println(str)
    }
}
