package com.algorithm.leetcode.simple;

public class Divide {

    public static void main(String[] args) {



        System.out.println(Integer.MIN_VALUE);

    }

    public int divide(int a, int b){
        // 如果前者为最小负数，后者为-1则返回最大整数
        if (a == Integer.MIN_VALUE && b == -1){
            return Integer.MAX_VALUE;
        }

        // 判断是否同号
        boolean flag = false;
        if ((a < 0 && b < 0) || (a > 0 && b > 0)){
            flag = true;
        }

        long dividend = Math.abs((long) a);
        long divisor = Math.abs((long) b);
        if (dividend < divisor){
            return 0;
        }

        int result = 0;
        int shift = 31;
        while (dividend >= divisor) {
            while (dividend < divisor << shift){
                shift -- ;
            }
            dividend -= divisor << shift;
            result += 1 << shift;
        }

        return flag ? result : -result;
    }
}
