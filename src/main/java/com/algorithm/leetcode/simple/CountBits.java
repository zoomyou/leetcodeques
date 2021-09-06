package com.algorithm.leetcode.simple;

public class CountBits {

    public int[] countBits(int n) {
        // 结果变量
        int[] result = new int[n + 1];

        // 循环赋值
        for (int i = 0; i <= n; i++){
            result[i] = calculate(i);
        }

        return result;
    }

    public int calculate(int s){
        int res = 0;

        while (s > 0){
            res += s & 1;
            s >>= 1;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(13 >> 1 & 1);

        int s = 13;
        s >>= 1;
        System.out.println(s);
    }

}
