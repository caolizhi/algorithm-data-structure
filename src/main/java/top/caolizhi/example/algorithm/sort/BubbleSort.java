package top.caolizhi.example.algorithm.sort;

import java.util.Arrays;

import static top.caolizhi.example.algorithm.utils.SortUtils.sortSwapUtil;

/**
 * 冒泡排序
 */
public class BubbleSort {

    /**
     * 反序
     * @param elementArray
     */
    public static void sort(int[] elementArray) {
        for (int i = elementArray.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (elementArray[j] > elementArray[j + 1]) {
                    sortSwapUtil(elementArray, j, j+1);
                }
            }
        }
    }

    /**
     * 正序，要判断数组越界
     * @param elementArray
     */
    public static void sort1(int[] elementArray) {
        for (int i = 0; i < elementArray.length; i++) {
            for (int j = 0; j < elementArray.length - i; j++) {
                if (((j + 1) >= (elementArray.length - i))) {
                    continue;
                }
                if (elementArray[j] > elementArray[j + 1]) {
                    sortSwapUtil(elementArray, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,4,3,2,7,2,9,5,3};
        int[] array1 = new int[]{1,4,3,2,7,2,9,5,3};
        BubbleSort.sort(array);
        BubbleSort.sort1(array1);
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        Arrays.stream(array1).forEach(System.out::print);
    }


}
