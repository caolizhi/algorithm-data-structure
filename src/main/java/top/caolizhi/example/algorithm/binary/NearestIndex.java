package top.caolizhi.example.algorithm.binary;

/**
 * 在一个有序数组上找到 >= 某个数的最左侧位置
 *
 *      N * 2 + 1  ===> ((N << 1) | 1)
 */
public class NearestIndex {

    public static int nearestIndex(int[] arr, int value) {
        int L = 0;
        int R = arr.length - 1;
        int index = -1 ;
        while (L <= R) {
          int mid = L + ((R - L) >> 1);
            if (arr[mid] >= value) {
                index = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return index;
    }

    // 复杂度较差方法
    public static int test(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num) {
                return i;
            }
        }
        return -1;
    }
}
