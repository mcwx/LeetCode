package com.leetcode.simple;

/**
 * @Description:反转字符串中的单词 III
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 示例 1:
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc" 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Auther: houpeng
 * @Date: 2020/5/17
 */
public class LeetCode557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char[] sArr = s.toCharArray();
        int i = 0;
        for (int j = 0; j < sArr.length + 1; j++) {
            if (j == sArr.length || sArr[j] == ' ') {
                reverse(sArr, i, j - 1);
                i = j + 1;
            }
        }
        return String.valueOf(sArr);
    }

    private static void reverse(char[] chars, int i, int j) {
        char tmp;
        while (i < j) {
            tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
    }
}
