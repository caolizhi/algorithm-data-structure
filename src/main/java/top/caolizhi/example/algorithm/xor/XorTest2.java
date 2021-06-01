package top.caolizhi.example.algorithm.xor;

/**
 * 2、一个数组中有个一种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这种数？
 */
public class XorTest2 {

    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,1,3};
        int b = 0;
        for (int i = 0; i < a.length; i++) {
             b ^= a[i];
        }
        System.out.println(b);;
    }

}
