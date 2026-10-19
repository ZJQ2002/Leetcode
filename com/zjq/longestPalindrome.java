package com.zjq;

/**
 * @Author: ZJQ
 * @DateTime: 2026/8/7 17:28
 **/
public class longestPalindrome {
    /**
     * 给你一个字符串 s，找到 s 中最长的回文子串。
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int strLen = s.length();
        int left = 0, right = 0;
        int len = 1;
        int maxStart = 0, maxLen = 0;

        for (int i = 0; i < strLen; i++) {
            left = i - 1;
            right = i + 1;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                len++;
                left--;
            }
            while (right < strLen && s.charAt(right) == s.charAt(i)) {
                len++;
                right++;
            }
            while (left >= 0 && right < strLen && s.charAt(left) == s.charAt(right)) {
                len = len + 2;
                left--;
                right++;
            }
            if (len > maxLen) {
                maxLen = len;
                maxStart = left;
            }
            len = 1;
        }
        return s.substring(maxStart + 1, maxStart + maxLen + 1);
    }

    /**
     * @solution
     * 从每一个位置出发，向两边扩散即可。遇到不是回文的时候结束。举个例子，str=acdbbdaa 我们需要寻找从第一个 b（位置为 3）出发最长回文串为多少。
     * 首先往左寻找与当期位置相同的字符，直到遇到不相等为止，然后往右寻找与当期位置相同的字符，直到遇到不相等为止，最后左右双向扩散，直到左和右不相等。
     * 每个位置向两边扩散都会出现一个窗口大小（len），如果 len>maxLen(用来表示最长回文串的长度），则更新 maxLen 的值。
     * 因为最后要返回的是具体子串，而不是长度，因此还需要记录一下 maxLen 时的起始位置（maxStart），即此时还要 maxStart=len。
     *
     * @complexity
     * 时间复杂度：O(n2)，其中 n 是字符串的长度。长度为 1 和 2 的回文中心分别有 n 和 n−1 个，每个回文中心最多会向外扩展 O(n) 次。
     * 空间复杂度：O(1)。
     */
}
