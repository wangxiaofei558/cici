package com.leetcode.easy;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseIntSolution {

    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) return 0;//因为该数的绝对值越界了，而且其翻转的结果超过了int范围，这里直接处理
        boolean mark = true;//该标记位用来记录x是正数还是负数
        if (x < 0) {//如果x是负数，则改变标记位，同时将负数变成正数
            mark = false;
            x = Math.abs(x);
        }
        String str = Integer.toString(x);//正数变成字符串String
        StringBuffer stringBuffer = new StringBuffer(str);//字符串String变成StringBuffer
        str = stringBuffer.reverse().toString();//StringBuffer翻转在变回字符串String
        long result = Long.parseLong(str);//字符串变成长整型，这里为什么用长整型来接收，是因为有很多数已经越界了
        if (mark == false) {//如果标记位为负数，则转回负数
            result = 0 - result;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {//如果翻转后的数字超过int类型范围，则返回0
            return 0;
        }
        return (int) result;
    }
}
