package top.caolizhi.example.algorithm.xor;

/**
 * 3. 一个数组中有两种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这两种数？
 */
public class XorTest3 {

    public static void printOddTimesNum(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
             eor ^= arr[i];
        }
        // eor = a ^ b
        // eor != 0
        // eor 必然有一个位置上是1
        // 找最右侧位置的 1
        int rightOne = eor & (~eor + 1);

        int onlyOne = 0; // eor'
        for (int i = 0; i < arr.length; i++) {
            if ((rightOne & arr[i]) != 0) {
                onlyOne ^= arr[i];
            }
        }
        System.out.println(onlyOne + " " + (eor ^ onlyOne));
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 4, 2, 2, 1, 1};
        XorTest3.printOddTimesNum(a);
    }

}
