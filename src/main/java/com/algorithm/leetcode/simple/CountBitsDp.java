package com.algorithm.leetcode.simple;

public class CountBitsDp {

    public int[] countBits(int n){
        // 声明结果变量
        int[] result = new int[n + 1];

        // 利用 dp 进行计算
        result[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                result[i] = result[i/2];
            } else {
                result[i] = result[i/2] + 1;
            }
        }

        return result;
    }

}
