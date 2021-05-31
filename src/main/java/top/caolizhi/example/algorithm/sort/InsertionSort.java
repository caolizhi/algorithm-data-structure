package top.caolizhi.example.algorithm.sort;

import static top.caolizhi.example.algorithm.utils.GenerateRandomArrayUtil.*;
import static top.caolizhi.example.algorithm.utils.SortUtils.sortSwapUtil;

/**
 * 插入排序
 */
public class InsertionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    sortSwapUtil(array, j, j - 1);
                }
            }
        }
    }

    public static void sort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (array[j] > array[j+1]) {
                    sortSwapUtil(array, j, j + 1);
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
            InsertionSort.sort(arr1);
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
