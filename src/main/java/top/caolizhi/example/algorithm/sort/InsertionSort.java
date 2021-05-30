package top.caolizhi.example.algorithm.sort;

import java.util.Arrays;

import static top.caolizhi.example.algorithm.utils.SortUtils.sortSwapUtil;

/**
 * 插入排序
 */
public class InsertionSort {

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    sortSwapUtil(array, j, j - 1);
                }
            }
        }
    }

    private static void sort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (array[j] > array[j+1]) {
                    sortSwapUtil(array, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{6,5,4,3,2,1};
        InsertionSort.sort1(array);
        Arrays.stream(array).forEach(System.out::print);
    }


}
