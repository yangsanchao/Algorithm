package Algotithm;

import utils.Utils;

/**
 * Created by ysc on 2017/11/13.
 */
public class Fibonacci {


    private static long fib(long index) {
        // 递归
        if (index == 0) return 0;
        if (index == 1) return 1;
        return fib(index - 1) + fib(index - 2);
    }

    private static long fib2(long index) {
        // 动态编程
        long f0 = 0;
        long f1 = 1;
        long f2 = 1;

        if (index == 0) return f0;
        if (index == 1) return f1;
        if (index == 2) return f2;

        for (int i = 3; i <= index; i++) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }
        return f2;
    }

    public static void main(String[] args) {

        System.out.println(Utils.getSystemTime());
        System.out.println("index: " + fib(30));
        System.out.println(Utils.getSystemTime());
        System.out.println("index2: " + fib2(30));
        System.out.println(Utils.getSystemTime());

        // 结论：动态编程的速度远远大于递归！
    }
}
