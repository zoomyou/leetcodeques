package com.algorithm.leetcode.simple;

public class AddBinary {

    public String addBinary(String a, String b){
        // 用于存放结果变量
        StringBuilder result = new StringBuilder();

        // 用于存放索引变量与进位数
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            // 访问当前位是否为空值
            int curA = i >= 0 ? a.charAt(i--) - '0' : 0;
            int curB = j >= 0 ? b.charAt(j--) - '0' : 0;

            // 计算当前为的和与进位
            int sum = curA + curB + carry;
            carry = sum >= 2 ? 1 : 0;
            sum = sum >= 2 ? sum - 2 : sum;
            result.append(sum);
        }

        // 判断最后的进位是否还能被加上
        if (carry == 1){
            result.append(1);
        }

        return result.reverse().toString();
    }
}
