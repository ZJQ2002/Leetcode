package com.zjq;

import java.util.HashMap;

/**
 * @Author: ZJQ
 * @DateTime: 2026/8/6 2:34
 **/
public class lengthOfLongestSubstring {
    public int solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length(), ans = 0;
        int left = 0, right = 0;
        for (; right < n; right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(map.get(c) + 1, left);
            }
            ans = Math.max(ans, right - left + 1);
            map.put(s.charAt(right), right);
        }
        return ans;
    }
}
