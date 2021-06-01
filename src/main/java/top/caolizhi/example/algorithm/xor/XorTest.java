package top.caolizhi.example.algorithm.xor;

import top.caolizhi.example.algorithm.utils.SortUtils;

import static top.caolizhi.example.algorithm.utils.GenerateRandomArrayUtil.printArray;

/**
 * 1、如何不用额外变量交换两个数？
 */
public class XorTest {

    public static void main(String[] args) {
        int[] a = {1,2};
        printArray(a);
        SortUtils.xorArraySwapUtil(a, 0 , 1);
        printArray(a);
    }

}
