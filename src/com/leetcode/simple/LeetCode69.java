package com.leetcode.simple;

/**
 * @Description:实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 示例 1:
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Auther: houpeng
 * @Date: 2019-08-08
 */
public class LeetCode69 {

    public static void main(String[] args) {
        mySqrt_01(4);
    }

    public static int mySqrt(int x) {
        long a = x;
        while (a * a > x) {
            a = x / a;
        }
        return (int) a;
    }

    public static int mySqrt_01(int x) {
        int left = 0;
        int right = x;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int mySqrt_02(int x) {
        int left = 0;
        int right = x;
        int ans = -1;
        while (left <= right) {
            int mid = right - (right - left) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int mySqrt_03(int x) {
        if (x == 1) {
            return 1;
        }
        int left = 0;
        int right = x;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
