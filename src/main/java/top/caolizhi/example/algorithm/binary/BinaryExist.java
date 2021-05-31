package top.caolizhi.example.algorithm.binary;

/**
 * 二分查找
 */
public class BinaryExist {

    public static boolean binaryExist(int[] sortedArray, int num) {
        int L = 0;
        int R = sortedArray.length - 1;
        int mid = 0;
        while (L < R) {
            mid = L + ((R - L) >> 1);  // mid = (L + R) / 2 ==> mid = L + (R - L) /2 ==> mid = L + ((R - L) >> 1)
            if (sortedArray[mid] == num) {
                return true;
            } else if (sortedArray[mid] > num) {
                R = L + ((mid - L) >> 1);
            } else {
                L = mid + 1;
            }
        }
        return  sortedArray[L] == num;
    }

    public static void main(String[] args) {
        System.out.println(2 * 2 + 1);
        System.out.println(((2 << 1) | 1));
    }
}
