package top.caolizhi.example.algorithm.binary;

/**
 * 局部最小值问题
 * 无序相邻不相等的数组上找到局部最小值位置
 * 1.先判断 0 位置，如果 0 位置比 1 位置小，直接返回 0 位置值；
 * 2.再判断 n-1 位置，如果 n-1 比 n-2 位置值小，直接返回；
 * 3.如果都不符合，肯定中间有局部最小，二分法
 */
public class LocalMinimum {

    public static int localMinimum(int[] arr, int value) {
        int L = 0;
        int R = arr.length - 1;
        int mid = 0;
        while (L <= R) {
            mid = L + ((R - L) >> 1);
            if (arr[L] < arr[L + 1]) {
                return L;
            } else if (arr[R - 1] > arr[R]) {
                return R;
            } else {
                if (arr[mid] > arr[mid - 1]) {
                    R = mid - 1;
                } else if (arr[mid] > arr[mid + 1]) {
                    L = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return L;
    }

}
