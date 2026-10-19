package com.zjq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: ZJQ
 * @DateTime: 2026/6/11 16:55
 **/
public class twoSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组元素，以空格分隔：");
        String input = scanner.nextLine();
        String[] strs = input.split(" ");
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        System.out.println("请输入目标值：");
        int target = scanner.nextInt();
        int[] result = solution(nums, target);
        System.out.println("结果：" + Arrays.toString(result));
    }

    public static int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        // 如果没有找到满足条件的两个数，返回[-1, -1]表示未找到
        return new int[]{-1, -1};
    }
}
