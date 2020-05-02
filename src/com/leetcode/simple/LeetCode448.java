package com.leetcode.simple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:找到所有数组中消失的数字 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * <p>
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * <p>
 * 示例:
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * 输出:
 * [5,6]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Auther: houpeng
 * @Date: 2020/5/2
 */
public class LeetCode448 {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};

        findDisappearedNumbers(nums);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            int newIndex = Math.abs(nums[i]) - 1;

            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {

            if (nums[i - 1] > 0) {
                result.add(i);
            }
        }
        return result;
    }
}
