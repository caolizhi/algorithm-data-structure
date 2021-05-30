package top.caolizhi.example.algorithm.utils;

public class SortUtils {

    public static void sortSwapUtil(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    }

    public static void sortBitSwapUtil(int[] array, int i, int j) {
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];
    }
}
