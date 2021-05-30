package top.caolizhi.example.algorithm.sort;

import java.util.Arrays;

/**
 *  选择排序
 *  1.找到数组中最小的那个元素，将它和数组的第一个元素交换位置，如果第一个元素就是最小元素，那么它就和自己交换；
 *  2.在剩下的元素中找到最小的元素，将它与数组的第二元素交换位置；
 *  3. 如此往复
 */
public class SelectionSort {

    public static void sort(int[] elementArray) {

        for (int i = 0; i < elementArray.length; i++) {
            for (int j = i+1; j < elementArray.length; j++) {
                if (elementArray[j] < elementArray[i]) {
                    swap(elementArray, i, j);
                }
            }
        }

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,4,3,2,7,2,9,5,3};
        SelectionSort.sort(array);
        Arrays.stream(array).forEach(System.out::print);
    }

}
