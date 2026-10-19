package com.zjq;

/**
 * @Author: ZJQ
 * @DateTime: 2026/8/6 1:57
 **/
public class smallestNumber {
    /**
     * 给你两个整数 n 和 t ，请你返回大于等于 n 的最小整数，且该整数的各数位之积能被 t 整除。
     *
     * @param n
     * @param t
     * @return 满足条件的最小整数
     */
    public int smallestNumber(int n, int t) {
        while (true) {
            int product = 1;
            int num = n;
            while (num > 0) {
                product = product * (num % 10);
                if (product == 0) {
                    return n;
                }
                num = num / 10;
            }
            if (product % t == 0) {
                return n;
            } else {
                n++;
            }
            if (n > 100) {
                return -1;
            }
        }
    }

    /**
     * @solution
     * 由于 0 可以被任何不等于 0 的整数整除，因此当一个整数的数位乘积等于 0 时，该整数的数位乘积可以被 t 整除。
     * 当整数中存在数位 0 时，数位乘积等于 0。当整数的最低位是 0 时即满足整数中存在数位 0，且对于任意整数 n，
     * 在范围 [n,n+9] 中一定存在一个整数的最低位是 0，因此对于任意整数 n，最多只需要遍历 10 个整数即可找到数位乘积可以被 t 整除的整数。
     * 从小到大遍历每个大于等于 n 的整数并计算数位乘积，当遇到一个整数的数位乘积可以被 t 整除时，该整数即为答案。
     *
     * @complexity
     * 时间复杂度：O(lgn)，其中 n 是给定的整数。对于每个整数计算数位乘积的时间是 O(lgn)，最多遍历 10 个整数。
     * 空间复杂度：O(1)。
     */
}
