package top.caolizhi.example.algorithm.sort;

import static top.caolizhi.example.algorithm.utils.GenerateRandomArrayUtil.*;
import static top.caolizhi.example.algorithm.utils.SortUtils.sortSwapUtil;

/**
 *  选择排序
 *  1.找到数组中最小的那个元素，将它和数组的第一个元素交换位置，如果第一个元素就是最小元素，那么它就和自己交换；
 *  2.在剩下的元素中找到最小的元素，将它与数组的第二元素交换位置；
 *  3. 如此往复
 */
public class SelectionSort {

    public static void sort(int[] elementArray) {

        for (int i = 0; i < elementArray.length; i++) {
            int min = i;
            for (int j = i+1; j < elementArray.length; j++) {
                if (elementArray[j] < elementArray[min]) {
                    min = j;
                }
            }
            sortSwapUtil(elementArray, i, min);
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
            SelectionSort.sort(arr1);
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
