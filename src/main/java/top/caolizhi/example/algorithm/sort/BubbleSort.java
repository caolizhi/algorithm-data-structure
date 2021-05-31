package top.caolizhi.example.algorithm.sort;

import static top.caolizhi.example.algorithm.utils.GenerateRandomArrayUtil.*;
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
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean success = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            // todo sort
            BubbleSort.sort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                success = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(success ? "Nice !" : "Fucking Fucked !");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        SelectionSort.sort(arr);
        printArray(arr);
    }


}
